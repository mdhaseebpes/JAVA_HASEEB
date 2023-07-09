package OopsComposition.Composition;


public class Main {

    public static void main(String[] args) {


        ComputerCase theCase = new ComputerCase("2208", "HP" , "300");
        Monitor theMonitor  = new Monitor("27 inch " , "Intel" , 29 , "2540*1140");
        Motherboard theMotherBoard = new Motherboard("BJ-200" , "Asus" , 5 ,
                6, "v2.66");
        PersonalComputer thePc  = new PersonalComputer("2210" , "HP" , theMonitor,theMotherBoard
        ,theCase);
/*
        thePc.getMonitor().drawPixel(12,12,"green");
        thePc.getMotherboard().loadProgram("Window OS");
        thePc.getComputerCase().pressPowerButton();*/

        thePc.powerUp();
    }
}
