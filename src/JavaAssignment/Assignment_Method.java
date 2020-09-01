package JavaAssignment;

public class Assignment_Method {


	public static void main(String[] args) {
		
		Assignment_Method as= new Assignment_Method();
		
		int sum=as.addNumbers();
		System.out.println("Sum of 2 numbers is :" +sum);
		
		 int product = as.returnProduct();
		 System.out.println("product of 2 numbers :" +product);
		 
		 double radius = as.circleRadius();
		 System.out.println("Radius of circle is :" +radius);
		 
		as.maximunNumber(10, 20, 30);
	    as.minimunNumber(10, 20, 30);
	    
	    as.evenOddNumber(13);
	    as.voteEligibility("susmita");
	    as.primeNumber(16);
	    as.enterMarks(52);
	    as.factorial(4);

	}
	
	
	
//	1.Write a program to print the sum of two numbers entered by user by defining your own method.

	public int addNumbers() {
		
		    int x= 10;
		    int y = 15;
		    int z= x+y;
		     return z;   
		    
	}
	
//	2. Define a method that returns the product of two numbers entered by user.
	public int returnProduct() {
		
	    int x= 10;
	    int y = 5;
	    int z= x*y;
	     return z;   
	    
}
	
		
//	3.	Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

	public double circleRadius() {
		
		int c= 10;
		double r= c/(2*3.141);
		return r;
		
	}
	
	 
	
//	4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	
	public void maximunNumber(int x, int y,int z) {

		if(x>y & x>z) {
		System.out.println("Maximun number is :" +x);
		}
		else if(y>z){
			
			System.out.println("Maximun number is :" +y);
		}
		else {
			System.out.println("Maximun number is :" +z);
		}
	
		
	}
	
     public void minimunNumber(int x, int y,int z) {

		if(x<y & x<z) {
		System.out.println("Minimum number is :" +x);
		}
		else if(y<z){
			
			System.out.println("Minimum number is :" +y);
		}
		else {
			System.out.println("minimum number is :" +z);
		}
		
		
	}

//	5. Define a program to find out whether a given number is even or odd.

     public int evenOddNumber(int x) {
    	 if (x%2==0) {
    		 System.out.println(x + "is even number");
    	 }
    	 else {
    		 System.out.println(x+ "is odd number");
    	 }
    	 
    	 return x;
     }
     
     
//	6. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.

     public String voteEligibility(String name) {
    	    
         int age;
        
         for(age=0;age<=18;age++) {
         if(age>=18) {
                
         System.out.println(name+ "  is eligible for vote");
         }
         }
		return name;
     }
     
//	7. Define a method to find out if number is prime or not.
     public int primeNumber(int num) {
    	 
    	boolean primenum = true;
    	 for(int i =2; i<num;i++) {
    		 if(num%i==0) {
    			 primenum=false;
    			 break;
    		 }
    	 }
    	 if(primenum) {
    		 System.out.println("This is prime number"); 
    	 }
    	 else {
    		 System.out.println("This is not a prime number");
    	 }

    	 
		return num;
    	 
    	 
     
     }

     
     
//	8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//	Marks        Grade
//	91-100         AA
//	81-90          AB
//	71-80          BB
//	61-70          BC
//	51-60          CD
//	41-50          DD
//	<=40          Fail

     public void enterMarks(int Marks) {
       	
       	 
     if(Marks>=91 & Marks <=100) {
    	 System.out.println("Grade is AA");
    	 
     }
     else if(Marks>=81 & Marks <=90){
    	 System.out.println("Grade is AB"); 
    	
     }else if(Marks>=71 & Marks <=80) {
    	 System.out.println("Grade is BB"); 
    
     }
     else if(Marks>=61 & Marks <=70) {
    	 System.out.println("Grade is BC"); 
    	
     }
     else if(Marks>=51 & Marks <=60) {
    	 System.out.println("Grade is CD"); 
    	
     }
     else if(Marks>=41 & Marks <=50) {
    	 System.out.println("Grade is DD"); 
    	 
     }
     else {
    	 System.out.println("Grade is Fail");
     }
	
   
     }
     
     
     
//	9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//	Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//	4! = 1*2*3*4 = 24
//	3! = 3*2*1 = 6
//	2! = 2*1 = 2
//	Also,
//	1! = 1
//	0! = 0
     
     public void factorial(int num) {
    	 
    	 int fact=1;
    	 
    	 for(int i=1; i<=num;i++) {
    		fact=fact*i;
    		
    	 }
    	 
    	 System.out.println("Factorial of "+num +"is" +fact); 
         
     }
 
    

}


