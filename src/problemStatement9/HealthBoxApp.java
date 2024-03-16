package problemStatement9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HealthBoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HealthBox healthBox = new HealthBox();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHealthBox Menu:");
            System.out.println("1. Schedule an Appointment.");
            System.out.println("2. Print Appointment Details.");
            System.out.println("3. Reschedule an Appointment.");
            System.out.println("4. Get Reminder.");
            System.out.println("5. Cancel the Appointments.");
            System.out.println("6. Exit.");
            System.out.println("=======================================");
            System.out.println("Enter an Option");
            System.out.println("=======================================");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nEnter Date (dd/mm/yyyy)");
                    String dateStr = scanner.next();
                    System.out.println("Enter Time (hh:mm)");
                    String timeStr = scanner.next();
                    System.out.println("Available Zones are\nA: America/Anchorage\nB: Europe/Paris\nC: Asia/Tokyo\nD: America/Phoenix");
                    System.out.println("=======================================");
                    System.out.println("Select the Zone");
                    System.out.println("=======================================");
                    String zone = scanner.next();
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                        Date date = dateFormat.parse(dateStr + " " + timeStr);
                        healthBox.scheduleAppointment(date, zone);
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter date and time in the correct format.");
                    }
                    break;

                case 2:
                    healthBox.printAppointmentDetails();
                    break;

                case 3:
                    System.out.println("\nCurrent Appointment Date is : " + healthBox.getFormattedDate());
                    System.out.println("Kindly Enter Number of Days to be postponed");
                    int daysToPostpone = scanner.nextInt();
                    System.out.println("Enter the new time in HH:mm");
                    String newTime = scanner.next();
                    healthBox.rescheduleAppointment(daysToPostpone, newTime);
                    break;

                case 4:
                    System.out.println();
                    healthBox.getReminder();
                    break;

                case 5:
                    healthBox.cancelAppointment();
                    break;

                case 6:
                    System.out.println("Exiting HealthBox application.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        }
	}

}
