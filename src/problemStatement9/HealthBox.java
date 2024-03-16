package problemStatement9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HealthBox {
	
	private Date appointmentDate;
    public String zone;

    public void scheduleAppointment(Date date, String zone) {
        this.appointmentDate = date;
        this.zone = zone;
        System.out.println("Successfully Booked");
    }

    public void printAppointmentDetails() {
        if (appointmentDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a z");
            System.out.println(dateFormat.format(appointmentDate));
        } else {
            System.out.println("No appointment booked.");
        }
    }

    public void rescheduleAppointment(int daysToPostpone, String newTime) {
        if (appointmentDate != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(appointmentDate);
            cal.add(Calendar.DAY_OF_MONTH, daysToPostpone);
            String newDate = new SimpleDateFormat("EEE, MMM d yyyy hh:mm a").format(cal.getTime());
            System.out.println("Your Appointment has been rescheduled to : " + newDate);
        } else {
            System.out.println("No appointment booked.");
        }
    }

    public void getReminder() {
        if (appointmentDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM d yyyy hh:mm a");
            System.out.println(dateFormat.format(appointmentDate));
        } else {
            System.out.println("No appointment booked.");
        }
    }

    public void cancelAppointment() {
        if (appointmentDate != null) {
            appointmentDate = null;
            System.out.println("Appointment has been cancelled!!");
        } else {
            System.out.println("No appointment booked.");
        }
    }

    public String getFormattedDate() {
        if (appointmentDate != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, MMM d yyyy hh:mm a");
            return dateFormat.format(appointmentDate);
        } else {
            return "No appointment booked.";
        }
    }
}
