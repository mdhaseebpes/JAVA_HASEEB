package firststeps;

public class PrimitiveChallenge {

    public static void main(String[] args) {

        byte myByte = 123;
        short myShort = 12345;
        int  myInt = 123456;
        int myTotal  = myInt + myShort + myByte;

        long myLong = 50000L + (myTotal*10);
        long myLong1 = 50000L + 10l * (myInt + myShort+myByte);
        System.out.println(myLong);
        System.out.println(myLong1);

        int myIntValue= 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;

        System.out.println(myIntValue + "- " + myFloatValue + "- " + myDoubleValue);

        //convert pound to kilogram
        double pound = 200d ;
        double kilo = pound *0.45359237d;

        System.out.println("pound in Kilograms = " + kilo);


    }
}
