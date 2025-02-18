public class operators {

    int a;
    int b;
    int result;

    public operators() {
        a = 10;
        b = 3;
    }

    public void arithmetic() {
        result = a + b;
        System.out.println("Sum of the two number is : " + result);

        result = a - b;
        System.out.println("Substraction of the two number is : " + result);

        result = a * b;
        System.out.println("Multiplication of the two number is : " + result);

        result = a / b;
        System.out.println("Divition of the two number is : " + result);

    }

    public static void main(String[] args) {
        operators obj = new operators();
        obj.arithmetic();
    }

}