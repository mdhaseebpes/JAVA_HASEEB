package SpeedConverter;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes>0){
            System.out.println("Invalid Value");
        }

       int megabytes = kiloBytes/1024;
        int remainingKiloBytes = megabytes%1024;

        System.out.println(kiloBytes +" KB = " + megabytes +" MB and " + remainingKiloBytes + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
