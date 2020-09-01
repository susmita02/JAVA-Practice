package JavaAssignment;

public class Assignment_Datatype {

	public static void main(String[] args) {

//		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		String str1 ="Hello";
		String str2 = "Susmita Panda";
		System.out.println(str1+ '\n' +str2);
		
//		2. Write a Java program to print the sum of two numbers. 
		int a=74;
		int b=36;
		int c= a+b;
		System.out.println(c);
	
//     3. Write a Java program to divide two numbers and print on the screen. 
		int x=50;
		int y=3;
		int z= x/y;
		System.out.println(z);
		
//		4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//		Test Data:
//		a. -5 + 8 * 6
//		b. (55+9) % 9 
//		c. 20 + -3*5 / 8 
//		d. 5 + 15 / 3 * 2 - 8 % 3 
		int resulta  = -5+8*6;
		System.out.println(resulta);
						
		int resultb  = (55+9) % 9;
		System.out.println(resultb);
		
		int resultc  = 20 + -3*5 / 8;
		System.out.println(resultc);
		
		int resultd  = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(resultd);
		
//		5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//		Test Data:
//		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//		Expected Output
//		2.138888888888889
		
		double db=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(db);
		
//		6. Try to concat "Hello Selenium" with a character 't'.
		
		String str11 = "Hello Selenium";
		char ch= 't';
		String str12 = Character.toString(ch);
		System.out.println(str11+str12);
		
//		7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//			"Your Toal amount is. 3700".
		
		int a1 = 100;
		int b1= 200;
		int c1= 3400;
		
		int d1= a1+b1+c1;
		System.out.println("Your Total amount is." + " " + d1);
		
//		8. What should be the output for :

			byte b3 = 065; 
			System.out.println(b3);
			
			
//			1. Take three numbers from the user and print the greatest number. 
			
			int x1= 25;
			int y1= 78;
			int z1= 87;
			if(x1>y1 && x1>z1) {
				System.out.println("The greatest is"+ ": "+x1);
			}
				else if(y1>z1) {
					System.out.println("The greatest is"+ ": "+y1);
				}
				else {
					System.out.println("The greatest is"+ ": "+z1);
			}



//			2. Write a Java program to test a number is positive or negative.
			
			int a2 = 35;
			int b2= -11;
			if(a2>0 ) {
				System.out.println(a2 +" is a positive number" );
			}
			else {
				System.out.println(a2 +" is a negative number" );
			}
		
			if(b2>0 ) {
				System.out.println(b2 +" is a positive number" );
			}
			else {
				System.out.println(b2 +" is a negative number" );
			}
		
	}

}
