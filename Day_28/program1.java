import java.util.*;
class Demo{

	static public void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num : ");
	int number = sc.nextInt();
	
	int sumofDivisors = 0;
	for(int i = 1; i<= number / 2; i++){
		if(number % i == 0){
			sumofDivisors += i;

		}

	}

	if(sumofDivisors < number){
		System.out.print(number+ " is Deficient num");

	}else {
		System.out.print(number+ " is not Deficient num");

	}
    }
}