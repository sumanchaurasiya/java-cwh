package com.company;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.TimeZone;
public class CalendarClass {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));

        System.out.println("Current Date: " + c.getTime());
        c.add(Calendar.MONTH, 4);
        System.out.println("after four years: " + c.getTime());

        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2011));
//        gc.roll(Calendar.YEAR, true);
        gc.roll(Calendar.MONTH, false);
        System.out.println(gc.getTime());
        System.out.println(gc.hashCode());

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);


    }
}
