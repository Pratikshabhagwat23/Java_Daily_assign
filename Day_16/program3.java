import java.util.*;
class Demo{

	static public void main(String[]args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Current : ");
	int I = sc.nextInt();

	System.out.println("Enter Resistance : ");
	int R = sc.nextInt();

	if(I >= 0 && R >= 0){
		System.out.println("Voltage : " +I * R);

	} else {
		System.out.println("Enter valid details");

		} 
 
	}

}