package SpeedConverter;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       long miles = Convert.toMilesPerHour(11.5);
        System.out.println("Miles per hour " + miles);

        Convert.printConversion(11.5);

            //Getting the current date value
            LocalDate currentDate = LocalDate.now();
            System.out.println("Current date: "+ currentDate);
            //Getting the current day
            int currentDay = currentDate.getDayOfMonth();
            System.out.println("Current day: "+currentDay);
            //Getting the current month
            Month currentMonth = currentDate.getMonth();
            System.out.println("Current month: "+currentMonth);
            //getting the current year
            int currentYear = currentDate.getYear();
            System.out.println("Current month: "+currentYear);



    }

}
