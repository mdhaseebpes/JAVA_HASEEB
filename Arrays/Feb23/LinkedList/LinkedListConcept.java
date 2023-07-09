package Arrays.Feb23.LinkedList;

import java.util.LinkedList;

public class LinkedListConcept {

    public static LinkedList<String> addMethodsLinkedList(){

        System.out.println("--------Adding ----------");
        LinkedList<String> linkedList = new LinkedList<>();

        //add methods
        linkedList.add("Delhi");
        linkedList.add(1 ,"Bangalore");
        linkedList.addFirst("India");
        linkedList.addLast("Kerala");

        //Queue add methods
        linkedList.offer("Asia");
        linkedList.offerFirst("World");
        linkedList.offerLast("Ocean");

        //Stack add methods
        linkedList.push("Universe"); // add in first element

        System.out.println(linkedList);

        return linkedList;
    }

    public static LinkedList<String> removeMethodsLinkedList(LinkedList<String> linkedList){

        System.out.println("--------Removing ----------");
        linkedList.remove(6);
        linkedList.remove("Ocean");

        System.out.println(linkedList);
       String s1 = linkedList.remove(); //removes first element
        System.out.println(s1 + " was removed");

        String s2  =  linkedList.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = linkedList.removeLast();  // removes last element
        System.out.println(s3 + " was removed");

        System.out.println(linkedList);
        //Queue /DeQueue poll methods
        String s4 =linkedList.poll();  // removes the first element
        System.out.println(s4 + " was removed poll method");

        String s5 =linkedList.pollFirst();  // removes the first element
        System.out.println(s5 + " was removed poll method");

        String s6 =linkedList.pollLast();  // removes the first element
        System.out.println(s6 + " was removed poll method");

        System.out.println(linkedList);

        //adding using push Stack
        linkedList.push("India");
        linkedList.push("Poland");
        linkedList.push("USA");
        linkedList.push("Universe");

        System.out.println(linkedList);
        //Stack remove method
       String s7 = linkedList.pop(); //removes first element
        System.out.println(s7 + " was removed using pop method");

        System.out.println(linkedList);
        return linkedList;
    }

    public static void getElementsLinkedList(LinkedList<String>  linkedList){

        System.out.println("--------Fetching ----------");
        System.out.println(" Element = " + linkedList.get(1));
        System.out.println("First Element = " + linkedList.getFirst());
        System.out.println("Last Element = " + linkedList.getLast() );

        System.out.println("Position " + linkedList.indexOf("Poland") );
        System.out.println("Position " + linkedList.lastIndexOf("Bangalore") );

        //Queue retrieval method
        System.out.println("Element from element() " + linkedList.element());

        //stack retrieval methods
        System.out.println("Element from peek() " + linkedList.peek());
        System.out.println("Element from peekFirst() " + linkedList.peekFirst());
        System.out.println("Element from peekLast() " + linkedList.peekLast());



    }
    public static void main(String[] args) {

        //adding elements
       LinkedList<String> linkedList =  addMethodsLinkedList();

       //fetching elements
        getElementsLinkedList(linkedList);

        //removing elements
      LinkedList<String> linkedList1 =  removeMethodsLinkedList(linkedList);

      LinkedList<String> finalList = new LinkedList<>();

      for(int i= linkedList1.size()-1;i>=0;i--){
            finalList.add(linkedList1.get(i));
      }

        System.out.println("Journey -- " + finalList);


    }
}
