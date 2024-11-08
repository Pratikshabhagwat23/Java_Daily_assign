//write a program that accepts integer value from user & prints square of each digit

import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number : ");
	int num = sc.nextInt();

	while(num > 0){
		int n = num % 10;
		
		System.out.print((n * n)+ "  ");
		num /= 10;

		}
		System.out.println();

	}

}