public class bike {
    private String brand;
    private String model;
    private String color;

    public bike(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public static void main(String[] args) {
        bike myBike = new bike("Bajaj", "Pulsar", "black");
        
        System.out.println("Brand: " + myBike.getBrand());
        System.out.println("Model: " + myBike.getModel());
        System.out.println("Color: " + myBike.getColor());
    
    }
}