package CurrentDateAndTime;

import java.util.*;

public class DateAndTime {
    
    public static void main(String[] args) {
        int day, month, year;
        int second, minute, hour;
        
        GregorianCalendar dateAndTime = new GregorianCalendar();
        day = dateAndTime.get(Calendar.DAY_OF_MONTH);
        month = dateAndTime.get(Calendar.MONTH);
        year = dateAndTime.get(Calendar.YEAR);
        second = dateAndTime.get(Calendar.SECOND);
        minute = dateAndTime.get(Calendar.MINUTE);
        hour = dateAndTime.get(Calendar.HOUR);
        
        System.out.println("The current date is "  + day + "/" + month + "/" + year);
        System.out.println("The current time is " + hour + ":" + minute + ":" + second);
    }
    
}