import java.util.*;

public class List
{
	public static void main(String... args)
	{

		ArrayList<String> list = new ArrayList<String>();
         
        list.add("ONE");
         
        list.add("TWO");
         
        list.add("THREE");
         
        list.add("FOUR");
         
        ListIterator iterator = list.listIterator();
         
        System.out.println("Elements in forward direction");
         
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

	//

         
        System.out.println("Elements in backward direction");
         
        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }

	list.remove("TWO");

	System.out.println("List Size:"+list.size());
	System.out.println("List:"+list); 


	 list.add(1, "ONE"); 
	System.out.println("List:"+list); 


	 ArrayList<String> list2 = new ArrayList<String>();
 
        list2.add("THREE");
 
        list2.add("FOUR");
 
        list2.add("FIVE");
 
        list2.add("SIX");
 
        System.out.println(list2);     //Output : [THREE, FOUR, FIVE, SIX]
 
        list.addAll(list2);   //Appends list2 at the end of list1
 
        System.out.println(list);    //Output : [ONE, TWO, THREE, FOUR, THREE, FOUR, FIVE, SIX]
 
        list.removeAll(list2);    //Removes the elements of list1 which are also elements of list2
 
        System.out.println(list);    //Output : [ONE, TWO]
 
        list.addAll(2, list2);    //Inserts all elements of list2 into list1 at position 2
 
        System.out.println(list);    //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX]
 
        list.retainAll(list2);    //Retains all elements of list1 which are also elements of list2
 
        System.out.println(list);    //Output : [THREE, FOUR, FIVE, SIX]
 
        list.clear();      //Removes all elements of list1
 
        System.out.println("List1:"+list);   //Output : [] 
	System.out.println("List2:"+list2); 

 
	System.out.println("Is list 1 empty:"+list.isEmpty()); 
	System.out.println("Does list 2 contain 111.111:"+list2.contains(111.1111));  

	System.out.println("Index of ONE:"+list2.indexOf("ONE"));  

	System.out.println("Last Index of FIVE:"+list2.lastIndexOf("FIVE"));
	 System.out.println("Element in 1 position:"+list2.get(1));   


	}




}