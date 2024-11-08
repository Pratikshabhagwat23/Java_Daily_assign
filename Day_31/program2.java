import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter hexa number : ");
	String hex = sc.nextLine();

	String bin = Integer.toString(Integer.parseInt(hex, 16));

	System.out.println("Binary num : "+bin);


	}


}