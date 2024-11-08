import java.util.*;
class Demo{

	static public void main(String args[]){
	
	System.out.println("Enter Octal : ");
	
	Scanner sc = new Scanner(System.in);

	String arr = sc.next();
	
	int leng = arr.length();
	
	int i = 0;
	int dec = 0;
	int num;
	
	while(true){
		if(i > leng - 1){
			break;
			}
			num = arr.charAt(i) - 48;
			dec = dec * 8 + num;
			i++;

			}
			System.out.println("Decimal : "+ dec);
		
	}

}