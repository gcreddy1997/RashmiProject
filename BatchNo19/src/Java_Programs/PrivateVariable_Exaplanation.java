package Java_Programs;

public class PrivateVariable_Exaplanation {
private int x;
public int y = 20;
public double z;

public void setmethod(int y){
	x = y/2; // 3/2  -->1.5    (.net)
	//z= y\2;  // 3\2  -->1      (.net)
	System.out.println(x);
 
}



	public static void main(String[] args) {
		PrivateVariable_Exaplanation obj = new PrivateVariable_Exaplanation();
		obj.x=30;
		obj.setmethod(80);


	}

}
