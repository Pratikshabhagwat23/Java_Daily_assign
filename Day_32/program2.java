//write a program to convert entered hexadecimal num to octal

import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter hexa num : ");

	String hex = sc.nextLine();
	int decimal = Integer.parseInt(hex, 16);
	
	String octal = Integer.toOctalString(decimal);

	System.out.println("Octal num : "+octal);


	}

}