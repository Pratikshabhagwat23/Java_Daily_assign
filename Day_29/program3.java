import java.util.*;
class Demo{
	
	static public void main(String args[]){
	
	int num;
	
	System.out.println("Enter num : ");

	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();

	while(num >= 0){
		if(num % 2 == 0){
			System.out.print(num+ "  ");
			num--;

			}

		}

	}

}