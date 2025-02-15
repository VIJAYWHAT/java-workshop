public class ArrayHW {

    public static void main(String[] arg) {
        ArrayHW arrayHW = new ArrayHW();
        arrayHW.reverseArray2();
        
    }

    private void arraySum(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int a : arr){
            sum += a;
        }
        System.out.println("Sum of the array is : " + sum);
    }

    private void maxValue() {
        int[] arr = {1, 2, 7, 4, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
            max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is : " + max);
    }

    private void reverseArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[array.length];

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }

        System.out.print("\nReversed array: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
    
    private void reverseArray2() {
        int[] array = {1, 2, 3, 4, 5};
        int start = 0;
        int end = array.length - 1;
        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.print("\nReversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
