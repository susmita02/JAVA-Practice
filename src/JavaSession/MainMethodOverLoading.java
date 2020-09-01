package JavaSession;

public class MainMethodOverLoading {

	
//	Main method overloading is possible in java but overriding is not possible
	
	public static void main(String[] args) {
		System.out.println("This is main method...");
	main(10);
	main("Susmita");
	}
	public static void main(int i) {
		System.out.println("This is main method..." +i);
	}
	public static void main(int i, int j) {
		System.out.println("This is main method..." +i+j);
	}
	public static void main(String s) {
		System.out.println("This is main method..." +s);
	}

}
