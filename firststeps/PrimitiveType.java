package firststeps;

public class PrimitiveType {

    public static void main(String[] args) {

        //int
        int myValue = 1000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Busted int Min value "  + (minIntValue-1));
        System.out.println("Busted int Max value "  + (maxIntValue + 1));

        int max = 2_147_483_647;
        System.out.println(max);

        //Byte
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println("Busted Min value "  + minByteValue);
        System.out.println("Busted Max value "  + maxByteValue);

        //Short
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        System.out.println("int Min value "  + minShortValue);
        System.out.println("int Max value "  + maxShortValue);

        //Long
        long myLongValue = 1000L;
        //Treats as an int if dont append with L
        long myValueLong = 2_147_483_647;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println("long Min value "  + minLongValue);
        System.out.println("long Max value "  + maxLongValue);

        //float
        float myFloatValue = 1000f;
        //Treats as an int if dont append with L
        float myValueFloat = 2_147_483_647;
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;

        System.out.println("float Min value "  + minFloatValue);
        System.out.println("float Max value "  + maxFloatValue);

        //Casting
        int myTotal = (minIntValue/2);

        byte myByte = (byte) (minByteValue/2);
        short myShort = (short) (minShortValue/2);


    }
}
