import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
        
        myArray obj = new myArray();
        obj.twoDArray();
        
    }

    private void basicArray(){
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        System.out.println("Basic Array");

        System.out.println("First element of array: " + array[0]); // Prints the first element of the array
        System.out.println("Last element of array: " + array[array.length - 1]); // Prints the last element of the array
        
        System.out.println("Array length is : " + array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    

    private void twoDArray() {
        int[][] twoDArray = new int[3][3];
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[0][2] = 3;
        twoDArray[1][0] = 4;
        twoDArray[1][1] = 5;
        twoDArray[1][2] = 6;
        twoDArray[2][0] = 7;
        twoDArray[2][1] = 8;
        twoDArray[2][2] = 9;
        // int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Another way to declare a 2D array

        System.out.println("Two Dimensional Array");
        // Nested loops to iterate over the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        String[][] student = {
            {"Alice", "A"},
            {"Bob", "B"},
            {"Charlie", "C"}
        };

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                System.out.println("Student " + (i+1) + " : " + student[i][j]);
            }
        }
    }
    private void ArrayFunc() {
        String[] classList = {"A", "B", "C", "D", "E"};

        System.out.println(Arrays.toString(classList)); // Prints the array as a string

        int index = Arrays.binarySearch(classList, "D");
        System.out.println("Index of D is : " + index);

        int[] numbers = new int[5]; // Declares an empty array of integers
        Arrays.fill(numbers, 4); // Fills the array with the specified value
        System.out.println(Arrays.toString(numbers));
    }

    private void CopyArray() {
        String[] classList = {"A", "B", "C", "D", "E"};

        String[] copyList = new String[classList.length];
        for (int i = 0; i < classList.length; i++) {
            copyList[i] = classList[i];
        }
        System.out.print("Original Array : ");
        for (int i = 0; i < classList.length; i++) {
            System.out.print(classList[i] + ", ");
        }
        System.out.print("\nCopied Array : ");
        for (int i = 0; i < copyList.length; i++) {
            System.out.print(copyList[i] + ", ");
        }
    }

    private void nameSearch() {
        String [] names = {"Abi", "Dinesh", "Udhaya", "VJ"};
        String searchName = "VJ ";
        boolean result = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                result = true;
                break;
            }
            else {
                result = false;
            }
        }
        if (result == true) {
            System.out.println("Name found");
        }
        else {
            System.out.println("Name not found");
        }
    }

}
