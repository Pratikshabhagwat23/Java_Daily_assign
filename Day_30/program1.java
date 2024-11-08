import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int temp = num;
	int rem;
	int fact;
	int sum = 0;

	while(temp > 0){
		rem = temp % 10;
		fact = 1;
		for(int i = 1; i<= rem; i++){
			fact *= i;
		
		
			}

			sum += fact;
			temp /= 10;

		}
			if(sum == sum){
				System.out.print(num+ " is Strong num");
			
		} else {

				System.out.print(num+ " is Not Strong num");
		}

	}

}