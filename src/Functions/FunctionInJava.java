package Functions;

public class FunctionInJava {
	
	//Can not create a function inside a function
	//Functions are parallel to each other and independent

	public static void main(String[] args) {
		
		
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		obj.getName();
	String n=	obj.getTrainerName();
	System.out.println(n);
	
	
	int s1=obj.sum(10, 20);
	System.out.println(s1);
	
	
	int s2= obj.getStudentMarks("Susmita");
	System.out.println(s2);
	}
	
	
//	1. No input and No return
	
	public void test() {
		System.out.println("This is a test method..");
	}
	
	
	public void getName() {
		System.out.println("This is getname method...");
	}
		
	
//	2. No input but some return
	
	public int addMethod() {
		
		int a=10;
		int b=20;
		int c =a+b;
		 return c;
	}
	
	public String getTrainerName() {
		String Name= "Naveen";
		return Name;
	}
	
	public boolean isPermanent() {
		
		boolean flag = true;
		return flag;
	}

 //3. Some input but some output	
	
	public int sum(int x, int y) {
		int s= x+y;
		return s;
	}
	
	public int getStudentMarks(String Name) {
		
		
		
		int Marks = -1;
		System.out.println("Get student marks for " + Name+ " is");
		if(Name.equalsIgnoreCase("Naveen")) {
			
			Marks = 10;
			
		}
		else if (Name.equalsIgnoreCase("Susmita")) {
			Marks = 20;
			
		}
		else if(Name.equalsIgnoreCase("Priti")){
			Marks = 30;
		}else {
			
			System.out.println("Name Not found");
		}
		return Marks;
	}
	
	
	
}
