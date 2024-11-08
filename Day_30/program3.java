import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	
	int temp = num;
	int rem;
	int sum = 0;
	
	while(temp > 0){
		rem = temp % 10;
		sum += rem;
		temp /= 10;

		}
		System.out.println("sum : "+sum);

	}

}