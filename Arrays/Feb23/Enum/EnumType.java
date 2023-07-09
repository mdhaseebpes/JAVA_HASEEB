package Arrays.Feb23.Enum;

import java.util.Random;

public class EnumType {

    /**
     * Java describes the enum type as : A special data type that contains predefined constants
     *
     * A constant is a variable whose value can't be changed ,once it's value has been assigned
     *
     * So an enum is a little like an array ,except its element are know , not changeable, and
     * each element can be referred to a by constant name ,instead of an index position
     *
     */

    public static void main(String[] args) {
        DayOfWeek weekDay;
        for(int i=0;i<10;i++){
            weekDay = getRandomDay();

          /*  System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name() ,weekDay.ordinal());

            if(weekDay == DayOfWeek.FRI){
                System.out.println("Friday is holiday");*/
            switchDayOfWeek(weekDay);
            }

    }

    public static DayOfWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
       DayOfWeek[]  allDays = DayOfWeek.values();
       return  allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfWeek weekDay){
        int weekDayInteger = weekDay.ordinal() +1 ;
        switch (weekDay){
            case WED:
                System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT:
                System.out.println("Saturday is Day " + weekDayInteger);
            default:
                System.out.println(weekDay.name().charAt(0) +
                weekDay.name().substring(1).toLowerCase()
                        + "day is day " + weekDayInteger);
        }
    }
}
