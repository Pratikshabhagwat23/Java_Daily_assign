////write a program that accepy two integers from user and prints Multi & Divi of them input: 10 20


import java.util.*;

class Demo{

	static public void main(String[]args){
	
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println("Multi is: "+(a*b));
	System.out.println("Division is: "+(b/a));


	}

}