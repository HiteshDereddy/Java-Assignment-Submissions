import java.util.Calendar;
import java.util.Date;

public class DateCalendarExample {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + calendar.getTime());
    }
}
