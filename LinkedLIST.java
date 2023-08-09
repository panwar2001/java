import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class LinkedLIST{
  public static void main(String[] args){
    List<String> Names=new LinkedList<>(); //Linkedlist is same as array list except List interface with linkedlist is used
    Names.add("ayush");
    Names.add("panwar");
    Names.add(1,"panwar2001"); //insert panwar2001 at index 1 ( 0 based indexing)
    System.out.println(Names);
    List<Integer> list1=new LinkedList<>();
    list1.add(2);
    list1.add(34);
    System.out.println("list1 ->"+list1); 
    List<Integer> list2=new LinkedList<>();
    list2.add(3);
    list2.add(54);
    System.out.println("list2 ->"+list2);
    list2.addAll(list1);   //Append a list at the end of another list
    System.out.println("list2+list1="+list2); 
    System.out.println("list1(1)="+list1.get(1)); //get the element of list1 at index 1 
    list1.remove(1);  // remove the list1 element at index 1 
    System.out.println("list 1 after index 1 element is removed ->"+list1);
    list2.remove(Integer.valueOf(54)); //Remove an element from the list by its value
    System.out.println("list2 after removal of 54 is ->"+list2);
    list2.clear(); // clear all the elements of list2
    System.out.println("list2 after clearing all the elements of it ->"+list2);
    
    List<Integer> list=new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println("list ->"+list);

    list.set(2,100); //set 100 at index 2 of list 
    System.out.println("after setting 100 at index 2 of list ->"+list);
    Boolean contains100=list.contains(100); //Check whether list contains 100 or not
    System.out.println("list contains 100 =>"+contains100);
    //Iterate all the elements of the list
    for(int i=0;i<list.size();i++){  
      System.out.println("list.get("+i+")="+list.get(i));
    }
    //For each loop to iterate list
    for(Integer num:list){
      System.out.println("for each num ="+num);      
    }
    //Iterating the list using iterator
    Iterator<Integer> it=list.iterator();
    while(it.hasNext()){
      System.out.println("iterator ->"+it.next());
    }
    
  }
}