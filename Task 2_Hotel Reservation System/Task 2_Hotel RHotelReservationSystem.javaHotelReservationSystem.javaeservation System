import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableRooms = 10;

        while(true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. Check Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Available Rooms: " + availableRooms);
                    break;

                case 2:

                    if(availableRooms > 0) {
                        availableRooms--;
                        System.out.println("Room Booked Successfully!");
                    } else {
                        System.out.println("No Rooms Available!");
                    }

                    break;

                case 3:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
