import java.util.*;
class Demo{

	static public void main(String args[]){
	
	String oct;
	String hex;
	
	System.out.println("Enter Octal number : ");

	Scanner sc = new Scanner(System.in);
	oct =  sc.next();

	int dec = Integer.parseInt(oct, 8);

	System.out.println("Hex : "+Integer.toHexString(dec));

	}

}