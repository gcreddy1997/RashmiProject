package Java_Programs;

public class Addition_of_TwoNumbers {
	static int x=10;  // instance variable
	int y=20;  // instance variable
	//static int z =10;
	void prasant(int a, int b){
		int x =50;  // local 
		int y =10;  // local
	System.out.println("addition of two numbers :"+(x+y));
	System.out.println(Addition_of_TwoNumbers.x);
	//System.out.println(Addition_of_TwoNumbers.y);
	}
	
	void ankit(int a, int b){
	System.out.println("Subtracion  of two numbers :"+(x-y));
	String x="Gcreddy";// local 
	int y =10;
	}
	
	public static void main(String args[]) {
			Addition_of_TwoNumbers obj= new Addition_of_TwoNumbers();
		//obj.ankit(30,10);
		obj.prasant(20,30);
	//	obj.x=50;
		//obj.prasant(20,30);
	}

}
