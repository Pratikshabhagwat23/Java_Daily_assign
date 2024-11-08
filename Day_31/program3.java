import java.util.*;
class Demo{

	static public void main(String args[]){
	
	int num;

	System.out.println("Enter num : ");

	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	int i = 0;
	int rem;
	double sum = 0;
	
	while(num != 0){
		rem = num % 10;
		sum += rem;
		num = num / 10;
		i++;

		}
		System.out.println("Average : "+ sum/i);

	}


}