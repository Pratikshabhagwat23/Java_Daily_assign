import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	int [] number = new int[10];

	System.out.println("Enter 10 num : ");
	for(int i = 0; i<10; i++){
		System.out.print("Enter integer "+ (i + 1) +": ");
		int num = sc.nextInt();

		if(num < 0){
			System.out.print("Negative number entered. Exiting the loop.");
			break;
	
			}

		}


	}

}