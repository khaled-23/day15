public class Bike implements Vehicle{
    private String brand;
    private int hour;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }


    @Override
    public double calculateRentalCost() {
        return hour*10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: "+brand+
                "\nDaily Rental Rate: $"+10+
                "\nRental Cost : $"+calculateRentalCost());
    }
}
