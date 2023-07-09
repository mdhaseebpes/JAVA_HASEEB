package Arrays.Feb23.Arrays;


import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] array2 = new int[4][4];

        System.out.println(Arrays.toString(array2));

        for(int[] outer : array2){
            System.out.println(Arrays.toString(array2));
        }

        System.out.println("array length -- " + array2.length);
        System.out.println("---------------");
        for(int i=0;i<array2.length;i++){

            for(int j=0;j<array2.length;j++){
               // System.out.print(array2[i][j] + " ");
                array2[i][j] = (i*10) + (j+1);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------");
        for(int[] outer :array2){
            for(int arr : outer){
                System.out.print(arr + " ");
            }
            System.out.println();
        }

        System.out.println("----------");
        System.out.println(Arrays.deepToString(array2));

        System.out.println("--------------");

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[]{"A" ,"QA", "Java"};

        System.out.println(Arrays.deepToString(anyArray));
        System.out.println();
        anyArray[1] = new String[][]{
                {"1","2"}, {"3","4" ,"5"} , {"6","7","8","9"}};
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println();
        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println("----Object----------");
        for(Object ele : anyArray){
            System.out.println("Element type = " + ele.getClass().getSimpleName());
            System.out.println("Element toString() = " + ele);
            System.out.println(Arrays.deepToString((Object[]) ele));

        }
    }
}
