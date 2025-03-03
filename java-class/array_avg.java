import java.util.stream.IntStream;

public class array_avg {

public static void main(String[] args) {
int[] arr1 = {10, 20, 30, 40, 50};
int[] arr2 = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};

int[] mergedArray = IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).toArray();

int arr3 = mergedArray[mergedArray. length / 2];

System.out.println("Middle element of merged array: " + arr3);
}
}