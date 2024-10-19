import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter mass : ");
	double m = sc.nextDouble();

	System.out.println("Enter velocity : ");
	double v = sc.nextDouble();

	if(m >= 0 && v >= 0){
		System.out.println("K.E of that object is : "+ m * v * v /2 );

	} else {

		System.out.println("Enter valid details");
		}

	}


}