package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainGroceryList {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit=false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice : " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit=true;
                    break;

            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - process Array list");
        System.out.println("\t 7 - To quit the application.");
    }

    public static  void addItem(){
        System.out.print("Enter enter the grocery item : ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static  void modifyItem(){
        System.out.print("Enter the current item : ");
        String currentItem = scanner.nextLine();

        System.out.print("Enter the replacement item : ");
        String newItem =scanner.nextLine();
        groceryList.modifyGroceryList(currentItem,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter the item name to be removed: ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryList(itemName);
    }

    public  static  void searchItem(){
        System.out.print("Item to search : ");
        String search =scanner.nextLine();
        boolean item =groceryList.onFile(search);
        if(item){
            System.out.println("Found " + item + " in our grocery list");
        }else{
            System.out.println(item + " is not present in grocery list");
        }
    }

    public static  void processArrayList(){
        ArrayList<String> newArrayList  = new ArrayList<String>();
        newArrayList.addAll(groceryList.getGroceryList());

        for(String a : newArrayList){
            System.out.println(a + " ");
        }
        newArrayList.stream().forEach(ele -> System.out.println(ele));

        ArrayList<String> nextList = new ArrayList<String>(groceryList.getGroceryList());

        for(String b : nextList){
            System.out.print(b + " ");
        }
        nextList.stream().forEach(ele -> System.out.println(ele));

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray =groceryList.getGroceryList().toArray(myArray);
        for(String c : myArray){
            System.out.print(c + " ");
        }

    }
}
