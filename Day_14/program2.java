import java.util.*;
class Swap{

	static public void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter num1: ");
	int num1 = sc.nextInt();

	System.out.println("Enter num2: ");
	int num2 = sc.nextInt();

	System.out.println("Before swap :" +num1+ " " +num2);

	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;

	System.out.println("After swap :" +num1+ " " +num2);	

	}

}