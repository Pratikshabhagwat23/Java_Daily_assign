import java.util.*;
class Demo{

	static public void main(String args[]){

	long num;
	int i = 0;
	int j = 0;
	System.out.println("Enter num : ");
	
	Scanner sc = new Scanner(System.in);
	
	num = sc.nextLong();
	
	while(num != 0){
		if((num % 10) % 2 == 1){
			i++;

		} else {
			j++;
			num = num % 10;

			}
			System.out.print("Odd : "+ i);
			System.out.print("Even : "+ j);	

	
		}


	}

}