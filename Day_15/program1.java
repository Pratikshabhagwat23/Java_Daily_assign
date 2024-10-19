import java.util.*;
class Demo{

	static public void main(String[]args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num1 : ");
	int num1 = sc.nextInt();

	System.out.println("Enter num2 : ");
	int num2 = sc.nextInt();
	
	System.out.println("Series of Even numbers ranging between 4 & 60 is : ");
	for(int i = num1; i<=num2; i++){
		if(i % 2 == 0){
			System.out.print(i+ "  ");

			}

		}
	

	}

}