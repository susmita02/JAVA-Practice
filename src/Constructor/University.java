package Constructor;

import java.util.ArrayList;

public class University {
	
	 String name;
     String country;
	 String establishedDate;
     ArrayList<String> course;
	
	

	public static void main(String[] args) {
		
		
		ArrayList<String> course = new ArrayList<String>();
		course.add("Electronics");
		course.add("Electrical");
		course.add("ComputerScience");
		
		new University("BPUT", "India", "07-07-2010", course);
		new University("Bangalore Univerisity");
		new University("Bangalore Univerisity", "India");
		new University("Bangalore Univerisity", "India", "10-10-2015");
	}
	
	
//	1. Design a University class template with the following features:
//		 variables:
//		name
//		country
//		stablishedDate
//		List of course provided in Array List<String>

	public University(String name, String country, String establishedDate, ArrayList<String> course) {
		
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.course = course;
		
		System.out.println("University name is " +name);
		System.out.println("Country name is " +country);
		System.out.println("Elstablished in " +establishedDate);
		System.out.println("Course offerering " +course);
	
	}


	
//		--Design the constructor of this class with different parameters and all parameters.
	public University(String name) {
		
		this.name = name;
		
		System.out.println("University name is " +name);
	}


	public University(String name, String country) {
		
		this.name = name;
		this.country = country;
		
		System.out.println(name+ " "+ "is in "+country);
	}


	public University(String name, String country, String establishedDate) {
		
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		
		System.out.println(name+ " "+ "Established in " +establishedDate +" in "+country);
	}
	
	
//		--Write the get method of each variable with return keyword, which will return the respective class variable. For example:
		public String getName(){
			
		    return name;
		}
	

      public String getCountry(){
			
		    return country;
		}
	
     public String getEstablishedDate(){
			
		    return establishedDate;
		}
       public ArrayList<String> getCourse(){
			
		    return course;
	}
	
	
	



}


