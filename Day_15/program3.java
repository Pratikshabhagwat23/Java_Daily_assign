import java.util.*;
class Demo{

	static public void main(String[]args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter distance : ");
	int distance = sc.nextInt();

	System.out.println("Enter time : ");
	int time = sc.nextInt();

	if(distance >=0 && time>=0){
		System.out.println("velocity =" +distance/time+ "m/s");

	} else {
		System.out.println("Enter valid details");

		}
	

	}


}