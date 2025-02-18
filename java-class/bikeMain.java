public class bikeMain {
    
    public static void main(String[] args) {
        bike myBike = new bike("Bajaj", "Pulsar", "black");
        
        System.out.println("Brand: " + myBike.getBrand());
        System.out.println("Model: " + myBike.getModel());
        System.out.println("Color: " + myBike.getColor());
    
    }
}
