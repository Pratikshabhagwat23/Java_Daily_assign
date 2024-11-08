import java.util.*;
class Demo{

	static public void main(String args[]){
	
	long num;
	int i = 0;

	System.out.println("Enter num : ");

	Scanner sc = new Scanner(System.in);

	num = sc.nextLong();

	while(num != 0){
		num = num / 10;
		i++;

		}
		System.out.println("No of digits : "+i);

	}

}