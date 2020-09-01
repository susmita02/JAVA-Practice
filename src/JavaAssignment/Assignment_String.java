package JavaAssignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment_String {

	public static void main(String[] args) {
		
		
//		1.  Write a program to check two different strings equality.
		
		String s1= "susmita";
		String s2 ="Susmita";
		if(s1.equals(s2)) {
			System.out.println("Name are same");
		}else {
			System.out.println("Name are different");
		}

//		2. Remove all  spaces in a String . 
//		For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		
		
		String st= "         Hello      Everyone       " ;
	    String st1=	st.replace("      ", "");
		System.out.println(st1.trim());
		
//		3. Write a program that will  print out last character and first character of a word.	
		
		String st2= "Intelligent";
		
		System.out.println(st2.length());
		System.out.println(st2.charAt(0));
		System.out.println(st2.charAt(st2.length()-1));
		System.out.println("1st Char is  " +st2.charAt(0)+ "  Last Char is  " +st2.charAt(st2.length()-1));
		
//		4. Write a program to verify a word or a character contains in the sentence.
		
		String s = "I am staying in Bangalore";

		System.out.println("Contains letter 'B': " + s.contains("B"));
		System.out.println("Contains word 'Bangalore': " + s.contains("Bangalore"));
		
		
//		5.Write a function/ method to reverse your own name.		
		
		
		String sr = "Susmita";
		StringBuilder sr1 = new StringBuilder(); 
		
        sr1.append(sr); 
        sr1= sr1.reverse(); 
        System.out.println(sr1);
        
//        6. Write a program that gives you last half of the string.
		
		String sl = "This is Rainy season";
//		System.out.println(sl.length());
//		System.out.println(sl.substring(14, 20));
		
		System.out.println(sl.substring(sl.indexOf("Rainy")+6,sl.length()));
		
//		7.Write a program to get the 3rd  “ e “ of the string .
//		 For example: “Welcome to Naveen Automation Lab ! “.
	
		String se= "Welcome to Naveen Automation Lab ! ";
		System.out.println(se.indexOf("e",se.indexOf("e",se.indexOf("e")+1)+1)+1);
		
//		8. Write a method which gives index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.		
		
		
		System.out.println("Question 8------");	
			
		String si= "automation";
		int a= si.length();
			if(a==10) {
				System.out.println("Index of a is :"+si.indexOf('a', 15));
			}
			else {
				System.out.println("Index of a is :"+si.indexOf('a', 1));
			}
		
		
	
	
		
//		9. Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop) .
		
		String ss = "Breaking string into pieces";
		String[] split =ss.split(" ");
		for(int j=0;j<split.length;j++) {
			
			System.out.println(split[j]);
		}
		
		

//		10. Assume that a string consists of 3 words, print out the middle one. 
		
		String st3 = "This isfor Automation";
		int Length = st3.length(); 
		String middle = st3.substring(Length/3,Length/2);
		System.out.println(middle);
		
		
//		11. get only numeric part from this String:
		String sn = "your transaction id is: 12345 and reference id is 34567";
		
		Pattern p = Pattern.compile("\\d+");  //Numeric string is represented by \\d+
		Matcher m =p.matcher(sn);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
			}
		
		
	}
	


