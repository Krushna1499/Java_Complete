package Day8;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// // How to declare arraylist
		ArrayList list=new ArrayList(); //we can store any type of elements
		
	//	ArrayList <String> list=new ArrayList <String>(); //strings
	//	ArrayList <Integer> list =new ArrayList <Integer>();
		//ArrayList <String> list=new ArrayList <String>(); //strings
		
		//Adding values to arraylist
		list.add("Krishna"); //0 index start from 0
		list.add("Lavhare"); //1
		list.add("Abhi");    //2
		list.add(100);
		list.add('A');
		
		//size of array list
		System.out.println(list.size()); //3
		System.out.println("Before removing elements: "+list);
		
		//remove elements/values from arrayList.
		list.remove(1);
		System.out.println(list.size());
		System.out.println("After removing elemnts: "+list);
		
		//inserting a new element into arraylist
		list.add(1,"sam");
		System.out.println(list.size());
		System.out.println("After removing elemnts: "+list);
		
		//read values from arraylist using loop
		
		/*for(String s:list) //advance for loop
		{
			System.out.println(s);
		}*/
		
		
	}
	

}
