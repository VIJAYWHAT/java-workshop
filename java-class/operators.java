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

    public void comparison() {
        if (a > b) {
            System.out.println("a is greater than b");
        }

        if (a < b) {
            System.out.println("a is less than b");
        }

        if (a == b) {
            System.out.println("They are both equal");
        }

        // > greater than
        // < less than
        // == equal condition
        // > == greater than or equal to
        // <== less than or equal to

    }

    public static void main(String[] args) {
        operators obj = new operators();
        obj.arithmetic();
    }

}