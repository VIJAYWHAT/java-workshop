public class myArray {
    public static void main(String[] args) {
        
        myArray obj = new myArray();
        obj.CopyArray();

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
    
    private void basicArray(){
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        System.out.println("Basic Array");
        System.out.println("Array length is : " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private void nameSearch() {
        String [] names = {"John", "Paul", "George", "Ringo"};
        String searchName = "Ringo";
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
