public class StudentMark {
    public static void main(String[] args) {
        int[] marks = { 50, 60, 70, 80, 90 };

        // Length of the array
        System.out.println("My Array length is : " + marks.length);
        
        // Accessing an array element
        System.out.println("My science mark: " + marks[3]); 

        // Iterating over an array
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark in subject " + (i + 1) + ": " + marks[i]);
            total += marks[i];
        }
        
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + total / marks.length);
    }
}
