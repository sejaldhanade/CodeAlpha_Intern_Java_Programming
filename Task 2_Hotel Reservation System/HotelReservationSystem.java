import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableRooms = 10;

        String customerName = "";
        int roomNumber = -1;
        boolean booked = false;

        while (true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. Check Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. View Booking Details");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Available Rooms: " + availableRooms);
                    break;

                case 2:

                    if (!booked && availableRooms > 0) {

                        System.out.print("Enter Customer Name: ");
                        customerName = sc.nextLine();

                        System.out.print("Enter Room Number: ");
                        roomNumber = sc.nextInt();

                        booked = true;
                        availableRooms--;

                        System.out.println("Room Booked Successfully!");

                    } else {

                        System.out.println("Room already booked or no rooms available.");
                    }

                    break;

                case 3:

                    if (booked) {

                        booked = false;
                        availableRooms++;

                        System.out.println("Reservation Cancelled Successfully!");

                    } else {

                        System.out.println("No Reservation Found!");
                    }

                    break;

                case 4:

                    if (booked) {

                        System.out.println("\n===== BOOKING DETAILS =====");
                        System.out.println("Customer Name : " + customerName);
                        System.out.println("Room Number   : " + roomNumber);
                        System.out.println("Status        : Confirmed");

                    } else {

                        System.out.println("No Booking Found!");
                    }

                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}
