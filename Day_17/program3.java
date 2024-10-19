import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter length = ");
	int l = sc.nextInt();

	System.out.println("Enter Breadth = ");
	int b = sc.nextInt();

	if(l >= 0 && b >= 0){
		System.out.println("Area of rectangle : "+ l * b);

	} else {
		System.out.println("Enter valid details");

		}


	}

}