package lesson_17_java_8_updates.datecalendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyMain {
    public static void main(String[] args) {
        // Previously, Date and Calendar
        Date date = new Date();
        // From Jan 1, 1970, how many milliseconds
        System.out.println(date.getTime());

        Date dateWithFlags = new Date(2000);
        System.out.println(dateWithFlags.getTime());

        System.out.println();

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
        System.out.println("Just get YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("Just get MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("Just get DATE: " + calendar.get(Calendar.DATE));
        System.out.println("TimeZone is: " + calendar.getTimeZone().getDisplayName());

        System.out.println("*****************************");
        // Java 8 introduction
        // Когда мы работает со временем, форма в котором показывает это время зависит от ваших флагов
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("What date will be tomorrow: " + tomorrow);
    }
}
