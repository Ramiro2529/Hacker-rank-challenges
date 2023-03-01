package intro;

import java.io.*;
import java.util.Calendar;

public class DateAndTime {


    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        int dayOutPut = calendar.get(Calendar.DATE);
        int monthOutPut = calendar.get(Calendar.MONTH);
        int yearOutPut = calendar.get(Calendar.YEAR);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println(day + " " + month + " " + year);
        System.out.println("dayOfWeek = " + dayOfWeek);

        switch (dayOfWeek) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
            default:
        }

        return null;
    }


}

