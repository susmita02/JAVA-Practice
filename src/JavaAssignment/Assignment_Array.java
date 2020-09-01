package JavaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_Array {

	public static void main(String[] args) {
		
		
//		Question 1: Write a program to print the following pattern using for loop:

//			00 01 02 03 04 05 06 07 08 09 
//			10 11 12 13 14 15 16 17 18 19 
//			20 21 22 23 24 25 26 27 28 29 
//			30 31 32 33 34 35 36 37 38 39 

		for (int j=0;j<4;j++) {
			String row= "";
			for (int i=0;i<10;i++) {
				row+=Integer.toString(j)+Integer.toString(i)+ " ";		
			
		}
		
			System.out.println(row);	
			}
		
		System.out.println("----------------------------");		

		String star ="";
		
			 for(int q=1; q<=4;q++) {
				 star+=Integer.toString(q)+"* ";	
				 System.out.println(star);
			 }
			 
//			Question 2: Write a program to create a static Array, having following cricket data:
//			--name, age, team name, DOB, gender, Strike Rate
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console
//	
	
	Object cricketdata[]= new Object[6];
	
	cricketdata[0]="Dhoni";
	cricketdata[1]=34;
	cricketdata[2]="India";
	cricketdata[3]="10-10-1977";
	cricketdata[4]='M';
	cricketdata[5]=63.22;
	
Object cricketdata1[]= new Object[6];
	
	cricketdata[0]="Virat";
	cricketdata[1]=32;
	cricketdata[2]="India";
	cricketdata[3]="10-10-1977";
	cricketdata[4]='M';
	cricketdata[5]=53.22;
	
	for(int s=0;s<cricketdata.length;s++) {
		
		System.out.println(cricketdata[s]);
		
	}
for(int s1=0;s1<cricketdata1.length;s1++) {
		
		System.out.println(cricketdata[s1]);
		
	}
	

//			Question 3: Try to print the following pattern on the console:
//			n = 4
//			n = 3
//			n = 2
//			n = 1
//			n = 0
	
	int n[] = new int[5];
	n[0]=0;
	n[1]=1;
	n[2]=2;
	n[3]=3;
	n[4]=4;
	System.out.println(n.length);
	
	for (int k=n.length-1;k>=0;k--) {
		System.out.println("n = "+n[k]);
	}

	

//			ArrayList:
//			1. Write a Java program to create a new array list, add some colors (string) and print out the collection

	ArrayList <String>ar= new ArrayList() ;
	
	ar.add("Name");
	ar.add("Age");
	ar.add("DOB");
	
	
	System.out.println(ar.size());
	System.out.println(ar.get(0));
	
//			2. Write a Java program to insert an element into the array list at the first and last positions.
ArrayList <String>ar1= new ArrayList() ;
	

	ar1.add("Name");
	ar1.add("Age");
	ar1.add("DOB");
	ar1.add("State");
	ar1.add(0,"Susmita");
	ar1.add(3,"Susmita1");
	System.out.println(ar1.size());
	System.out.println(ar1.get(0));
	System.out.println(ar1.get(3));
	
//			3. Write a Java program to retrieve an element (at a specified index) from a given array list.

	System.out.println(ar1.get(0));
	System.out.println(ar1.get(3));
	
	
//			4. Write a Java program to update specific array element by given element.
	
	System.out.println(ar.indexOf("Age"));
	
//			5. Write a Java program to remove the third element from a array list. 

//	ar.remove(3);
	ar.remove("DOB");
	System.out.println(ar.indexOf("DOB"));
	
	
//			6. Write a Java program to search an element in a array list.

	ar.indexOf("Age");
	ar.get(0);
//			7. Write a Java program to reverse elements in a array list
	
	ArrayList <Integer> arList= new ArrayList() ;
	
	arList.add(11);
	arList.add(12);
	arList.add(13);
	
//	
//	for (int ar11=0;ar11<=arList.size();ar11++) {
//		System.out.println(arList.get(ar11));
//	}
	Collections.reverse(arList);
	System.out.println(arList);
	
	for (int ar11=arList.size()-1;ar11>=0;ar11--) {
		
		System.out.println(arList.add(arList.get(ar11)));
	}

//			8. Write a Java program to extract a portion of a array list.
	
	ArrayList<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");
	  
	  System.out.println("Original list: " + list_Strings);
	  
	  
	  List<String> sub_List = list_Strings.subList(0, 2);
	  System.out.println("List of first 2 elements: " + sub_List);
	

//			9. Write a Java program of swap two elements in an array list.
	  
		
		ArrayList <Integer> arList1= new ArrayList() ;
		
		arList1.add(11);
		arList1.add(12);
		arList1.add(13);
	
		Collections.swap(arList1, 1, 2);
		
		System.out.println(arList1);

//			10. Write a Java program to empty an array list.
	ArrayList <Integer> arList2= new ArrayList() ;
		
		arList2.add(11);
		arList2.add(12);
		arList2.add(13);
		
	    arList2.removeAll(arList2);
		
		System.out.println(arList2);

//			11. Write a Java program to trim the virtual capacity of an array list the current list size.
		
ArrayList <Integer> arList3= new ArrayList() ;
		
		arList3.add(11);
		arList3.add(12);
		arList3.add(13);
		
	  		System.out.println(arList3);
	  		arList3.trimToSize();
	  		System.out.println(arList3);

//			12. Write a Java program to print all the elements of a ArrayList using the position of the elements
	  		
	  		
	  		ArrayList <String> c1 = new ArrayList <String> ();
	  	  c1.add("Red");
	  	  c1.add("Green");
	  	  c1.add("Black");
	  	  c1.add("White");
	  	  c1.add("Pink");
	  	  System.out.println("\nOriginal array list: " + c1);
	  	  System.out.println("\nPrint using index of an element: ");
	  	  int no_of_elements = c1.size();
	  	  for (int index = 0; index < no_of_elements; index++)
	  	   System.out.println(c1.get(index));

	}	
	
}

