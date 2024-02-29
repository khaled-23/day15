import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();

        int choice;

        while(true){
            System.out.println("Vehicle Rental System" +
                    "\n1. Rent a Car" +
                    "\n2. Rent a Bike" +
                    "\n3. Rent a Truck" +
                    "\n4. View Rented Vehicles" +
                    "\n5. Exit");
            try{
                choice = Integer.parseInt(s.nextLine());
            }catch(NumberFormatException e){
                continue;
            }



            switch(choice){
                case 1:
                    System.out.println("Enter Car Model:");
                    String model = s.nextLine();
                    int days = 0;
                    while(days <= 0){
                        System.out.println("Enter Rental Days:");
                        try{
                            days = Integer.parseInt(s.nextLine());
                        }catch(NumberFormatException e){
                            continue;
                        }
                    }
                    Vehicle car = new Car(model,days);
                    rentedVehicles.add(car);
                    displayDetails(car);
                    System.out.println("---------------------");
                    break;
                case 2:
                    System.out.println("Enter Bike Brand:");
                    String brand = s.nextLine();
                    int hour = 0;
                    while(hour <= 0){
                        System.out.println("Enter Rental Hours:");
                        try{
                            hour = Integer.parseInt(s.nextLine());
                        }catch(NumberFormatException e){
                            continue;
                        }
                    }
                    Vehicle bike = new Bike(brand,hour);
                    rentedVehicles.add(bike);
                    displayDetails(bike);
                    System.out.println("---------------------");
                    break;
                case 3:
                    System.out.println("Enter Truck Type:");
                    String type = s.nextLine();
                    int week = 0;
                    while(week <= 0){
                        System.out.println("Enter Rental weeks:");
                        try{
                            week = Integer.parseInt(s.nextLine());
                        }catch(NumberFormatException e){
                            continue;
                        }
                    }
                    Vehicle truck = new Truck(type,week);
                    rentedVehicles.add(truck);
                    displayDetails(truck);
                    System.out.println("---------------------");
                    break;
                case 4:
                    for(Vehicle v:rentedVehicles){
                        int count=0;
                        System.out.println("Rented Vehicle:" +
                                "\n"); v.displayDetails();
                        System.out.println("---------------------");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    System.exit(0);
                default:
                    continue;
            }

        }
    }

    public static void displayDetails(Vehicle s){
        s.displayDetails();
    }
}