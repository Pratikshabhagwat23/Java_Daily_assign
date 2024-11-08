import java.util.*;
class Demo{

	static public void main(String args[]){
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	num = sc.nextInt();
	int sum = 0;
	for(int i = 1; i * i <=num; i++){
		if(num % i == 0){
			sum += i;

			}
			if(num / i != i && num % (num / i) == 0){
				if(i == 1){
						continue;
					}
					sum += num / i;


			}
			System.out.println("sum ="+sum);
			if(sum > num){
				System.out.println("abundant number");

			} else {
				System.out.println("not abundant");

			}
				

		}

	}


}