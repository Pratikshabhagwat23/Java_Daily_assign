import java.util.*;
class Demo{

	static public void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Hexa number : ");

	String hexNumber = sc.nextLine();
	
	int decimalNumber = Integer.parseInt(hexNumber, 16);

	System.out.println("Decimal num : "+decimalNumber);


	}

}