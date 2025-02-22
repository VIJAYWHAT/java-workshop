public class ArrayHW {

    public static void main(String[] arg) {
        // ArrayHW arrayHW = new ArrayHW();
        // arrayHW.arraySum();
        int[] arr = {1,2,3,4,5};
        System.out.println();
        int[] rev = new int[5];
        int index = 0;
        for(int i = arr.length-1; i >= 0; i--) {
        rev[index] = arr[i];
            index++;
        }
        System.out.print("Reversed array is : ");
        for(int a : rev) {
            System.out.print(a + " ");
        }
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
}
