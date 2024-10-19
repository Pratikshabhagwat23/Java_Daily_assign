import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("hours : ");
	int hrs = sc.nextInt();

	if(hrs >= 0){
		System.out.print("Sec : "+hrs * 60 * 60);

	} else {
		System.out.print("Enter valid details");

		}
	
	}



}