import java.util.*;
class Demo{

	static public void main(String[]args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num1: ");
	int num1 = sc.nextInt();

	System.out.println("Enter num2: ");
	int num2 = sc.nextInt();

	for(int i = num1; i<=num2; i++){
		if(i % 2 == 1){
			System.out.print(i+" ");
		} else {
			System.out.print(" ");
	
			}

		}

	}

}