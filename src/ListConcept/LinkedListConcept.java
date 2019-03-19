package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) 
	{
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("QTP");
		ll.add("Selenium");
		System.out.println("Elements added to Linked list:"+ll);
		
		//1.Add Appium to first and SQL to end of list 
		ll.addFirst("Appium");
		ll.addLast("SQL");
		System.out.println("Elements added to exisiting list at first and last position:"+ll);
	
		//2.Add element at specified index
		ll.add(1,"POM");
		System.out.println("New Element inserted at 1st index of list"+ll);
		
		//3.Get the elements at specified position in list
		System.out.println(ll.get(1));
		
		//4.Set the elements at specified position in list
		ll.set(2, "Bootstrap");
		System.out.println(ll.get(2));
		
		//5.Remove First and Last Elements of list
		ll.removeFirst();
		ll.removeLast();
		System.out.println(""+ll);
		
		//6.Remove element at specified location of list
		ll.remove(0);
		System.out.println(""+ll);
		
		System.out.println("*******************");
		//7.Print all elements of list using for loop
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(""+ll.get(i));
		}
		
		System.out.println("*******************");

		//8.Print all elements of list using advanced for loop
		for(String s:ll)
		{
			System.out.println(s);
		}
		System.out.println("*******************");

		//9.Print all elements of list using iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
