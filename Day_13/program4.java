import java.util.*;
class Factorial{

	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter any number to find its factorial");

	int num = sc.nextInt();

	int fact = 1;
	for(int i = 1; i<=num; i++){
		fact = fact*i;
	}
	
	System.out.println("The factorial of" + num + "  " + "is:" + " " + fact);

	}

}