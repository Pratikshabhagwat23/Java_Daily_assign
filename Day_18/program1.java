import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a : ");
	int a = sc.nextInt();

	System.out.println("Enter b : ");
	int b = sc.nextInt();

	System.out.println("Before swap : "+a + "  " +b);

	b = a + b - (a = b);

	System.out.println("a : "+ a);
	System.out.println("b : "+ b);

	}

}