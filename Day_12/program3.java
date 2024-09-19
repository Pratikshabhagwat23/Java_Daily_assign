////write a program that accepy two integers from user and addition of their Cubes and Sub of their Sqaures


import java.util.*;

class Demo{

	static public void main(String[]args){
	
	Scanner sc = new Scanner(System.in);

	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println("Addition of 1000 & 8000 is : "+((a*a*a)+(b*b*b)));
	System.out.println("Substraction of 100 & 400 is : "+((a*a)-(b*b)));

	}

}