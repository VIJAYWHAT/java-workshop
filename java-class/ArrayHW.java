public class ArrayHW {
    public static void main(String[] args) {
        ArrayHW obj = new ArrayHW();
        obj.maxValue();

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
