import java.util.*;
class Demo{

	static public void main(String[]args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num1 : ");
	int num1 = sc.nextInt();

	System.out.println("Enter num2 : ");
	int num2 = sc.nextInt();

	if(num1 > num2){

		System.out.println("Max : "+num1);
	
	} else if(num1 == num2) {

		System.out.println("Equal");

	} else {
		System.out.println("Max : "+num2);

		}

	}

}