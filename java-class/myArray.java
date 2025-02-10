public class myArray {
    public static void main(String[] args) {
        String [] names = {"John", "Paul", "George", "Ringo"};
        String searchName = "Ringo1";
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
