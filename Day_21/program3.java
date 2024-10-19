import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Distance : ");
	int dist = sc.nextInt();

	if(dist >=0){
		System.out.print("dist : "+ dist * 1000);
		
	} else {
		System.out.print("Enter valid details");

		}


	}


}