import java.util.*;

class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num = ");
	int num = sc.nextInt();

	for(int i = 0; i < 10; i++){
		System.out.println(num+ " X " + (10 - i) + " = " +num * (10 - i));

		}


	}


}