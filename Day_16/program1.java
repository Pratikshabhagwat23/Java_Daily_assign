import java.util.*;
class PerfectNum{

	static public void main(String[]args){
	
	Scanner sc = new Scanner(System.in);

	int sum = 0;
	
	System.out.println("Enter num : ");
	int num = sc.nextInt();
	
	for(int i = 1; i<=num/2; i++){
		if(num % i == 0){
			sum += i;

		} if(num >0 || sum == num){
			System.out.println("number is perfect");

		}  else {
			System.out.println("number is not perfect");

			}

		}

	}

}