public class Car implements Vehicle{
    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }



    @Override
    public double calculateRentalCost() {
        return days*50;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: "+model+
                "\nDaily Rental Rate: $"+50+
                "\nRental Cost : $"+calculateRentalCost());
    }

}
