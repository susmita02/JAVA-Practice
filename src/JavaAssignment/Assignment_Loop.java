package JavaAssignment;

public class Assignment_Loop {

	public static void main(String[] args) {
		
		
// 1. WAP to print following output:
//			I am Batman	5 times
		
		String str ="I am Batman";
		int i=1;
		while(i<=5) {
			System.out.println(str);
			i++;
		}
		
// 2. WAP to print following output:
//			I am Batman 1 to 9
		System.out.println("---------");
		    int j=1;
		    while(j<=9) {
			System.out.println(str +" "+j);
			j++;
		}
			
// 3. WAP to print 10 to 1 using for, while and do-while loop	
		    System.out.println("-----For Loop----");
		    
		    for(int x=10;x>=1;x--) {
		    	System.out.println(x);
		    }
		    System.out.println("-----While Loop----");
		    int x=10;
			while(x>=1) {
				System.out.println(x);
				x--;
			}
			System.out.println("-----Do While Loop----");
			
		    int y=10;
		    do {
		    	System.out.println(y);
		    	y--;
		    }
			while(y>=1);
//  4. Write a program in Java to print "Hello World" ten times using while loop	    
		    System.out.println("---------");
		    
		    int a=1;
		    while(a<=10) {
		    	System.out.println("Hello World");
		    	a++;
		    }
		    
//  5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered   
		    System.out.println("---------");  
		  int b=1;
		  while(b<= 10) {
			System.out.println(b);

			      if (b%7 == 0) {
			        System.out.println("This is multiple of 7");
			        break;
			      }

			      b++;
			    }
		  }
		    
		    
		    
			
	}


