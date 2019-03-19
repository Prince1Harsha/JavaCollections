package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) 
	{
		
		//1.Non-generic array list without a type of object stored
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Harsha");
		al.add(500.55);
		al.add(true);
		for(int i=0; i<al.size();i++)
		{
			System.out.println("Elements of Array List are:"+al.get(i));
		}
		
		System.out.println("*******************");
		
		//2.Generic Array Lists with Object types
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		for(int i=0;i<al2.size();i++)
		{
			System.out.println(al2.get(i));
		}
		System.out.println("_____________________");
		
		//3. User Defined Generic class Object Array List
		
		ArrayList<E> al3 = new ArrayList<E>();
		//Employee class Objects
		EmployeeData e1 = new EmployeeData("Harsha",27,"DEV");
		EmployeeData e2 = new EmployeeData("Shree",28,"QA");
		EmployeeData e3 = new EmployeeData("Veera",29,"Admin");
		
		//Create Array List for Employees
		ArrayList<EmployeeData> al4= new ArrayList<EmployeeData>();
		al4.add(e1);
		al4.add(e2);
		al4.add(e3);
		
		//Traverse through the ArrayList
		Iterator<EmployeeData> it = al4.iterator();
		while(it.hasNext())
		{
			EmployeeData emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		System.out.println("==============");
		
		//4. addAll() used to add one arraylist elements to other
		al.addAll(al2);
		//System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(""+al.get(i));
		}
		
		System.out.println("===================");
		
		//5. removeAll() used to remove one arraylist elements to other
		al.removeAll(al2);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(""+al.get(i));
		}
		
		System.out.println("***********************");
		
		//6. retainAll() used to return only matching values in both arraylists
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Harsha");
		al5.add("Shree");
		al5.add("Mom");
		
		ArrayList<String> al6 = new ArrayList<String>();
		al6.add("Harsha");
		al6.add("Shrees");
		al6.add("Moms");
		
		al5.retainAll(al6);
		for(int i=0;i<al5.size();i++)
		{
			System.out.println(al5.get(i));
		}
		
	}//Method
}//Class
