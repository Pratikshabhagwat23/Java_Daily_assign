import java.util.*;
class Demo{

	static public void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	int count = 0;
	int num = 1;
	
	System.out.println("The first " +n+ "deficient numbers are : ");

	while(count < n){
		int sumofDivisors = 0;
		for(int i = 1; i<= num / 2; i++){
			if(num % i == 0){
				sumofDivisors += i;

				}

			}

			if(sumofDivisors < num){
				System.out.print(num+ " ");
				count++;

			}
				num++;

		}


	}

}