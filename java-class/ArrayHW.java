public class ArrayHW {
    public static void main(String[] args) {
        ArrayHW obj = new ArrayHW();
        obj.arraySum();
    }

    private void arraySum(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int a : arr){
            sum += a;
        }
        System.out.println("Sum of the array is : " + sum);
    }
}
