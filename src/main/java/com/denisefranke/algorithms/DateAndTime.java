package com.denisefranke.algorithms;

import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormatSymbols;

/**
* Date And Time - returns Day of week taking leap years into consideration
*
* @Author Denise Franke
*
* Usage:
*   echo '12 26 2017' | java DateAndTime // TUESDAY
*   echo '02 29 2004' | java DateAndTime // SUNDAY
*
**/
public class DateAndTime {     

   static String getDay(String day, String month, String year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        return new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(getDay(day, month, year));
    }

}
