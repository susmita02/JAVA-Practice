package JavaSession;

public class StaticNonStatic {

	String name;
	static int age;
	public static void main(String[] args) {
	
		

//		Non static variable and methods can only be called with the help of object refrence
//      Common property of a class will be declared as static.
//		Main method is static, because main method is called by JVM and JVM will not create object to call main.
//		Main method is void, because it does not return any value
		
//		1. Direct calling static variable and method : No need to create object		
       age=25;
       getAge();
       StaticNonStatic obj = new StaticNonStatic();  
       obj.name = "Susmita";
       obj.getName();
       
//     2. Call by class name: static variable
       StaticNonStatic.age= 34;
       StaticNonStatic.getAge();
       
//     3. Can we call staic variable/methods with object: yes but it will give warning
       obj.getAge();
       
	}
	
	public void getName() {
		
		System.out.println("The name is " +name);
	}
    public static void getAge() {
		
		System.out.println("The age is " +age);
	}
}
