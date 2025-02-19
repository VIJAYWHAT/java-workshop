public class loop {

    public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};
    int searchkey = 10;
    boolean result = false;

    for(int n : numbers) {
        if(n == searchkey) {
            result = true;
            break;
        }
        else {
            result = false;
        }
        
    }
    if (result == true) {
        System.out.println("Number found");
    
    }
    else{
        System.out.println("Number not found");

    }
    }
}