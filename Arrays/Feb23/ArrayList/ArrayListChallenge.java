package Arrays.Feb23.ArrayList;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

    static Scanner scanner = new Scanner(System.in);

    public static  void addSortList(){
        boolean flag = true;
        ArrayList<String> grocery = new ArrayList<>();
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 :
                    addItems(grocery);
                case 2:
                    removeItems(grocery);
                default : flag = false;
            }
            grocery.sort(Comparator.naturalOrder());
            System.out.println(grocery);
        }

    }

    public static void addItems(ArrayList<String> grocery){
        Scanner scan = new Scanner(System.in);
        System.out.println("Add items (separated by comma ) ");
        String[]  input =scan.nextLine().split(",");

        for(String i: input){
          String trimmed =  i.trim();
          if(!grocery.contains(trimmed)){
              grocery.add(trimmed);
          }
        }

    }

    public static void removeItems(ArrayList<String> grocery){
        Scanner scan = new Scanner(System.in);
        System.out.println("remove items (separated by comma ) ");
        String[]  input =scan.nextLine().split(",");

        for(String i : input){
           String trimmed = i.trim();
           if(grocery.contains(trimmed)){
               grocery.remove(trimmed);
           }
        }
    }

    private static void printActions(){
        String textBlock = "Available actions:  "+
                "\n 0 - shutdown " +
                "\n 1 - to add item to list (comma delimited list) " +
                "\n 2 - remove any items (comma delimited list) " +
                "\n Enter a number for which action you want to do :";
        System.out.println(textBlock + " ");
    }

    public static void main(String[] args) {
       addSortList();
    }


}
