import java.util.*;
class Demo{

	static public void main(String[]args){
	
	Scanner  sc = new Scanner(System.in);

	System.out.println("Enter first number: ");
	int f_num = sc.nextInt();

	System.out.println("Enter second number: ");
	int s_num = sc.nextInt();

	System.out.println("Enter sign of operation: ");
	char sign = sc.next().charAt(0);

	switch(sign){
	case'+' : 
		System.out.println("Addi of "+f_num+" & "+s_num+"is "+(f_num+s_num));
		break;

	case'-' :
		System.out.println("sub of "+f_num+" & "+s_num+" is"+(f_num>s_num?f_num-s_num:s_num-f_num));
		break;

	case'/' :
		System.out.println("div of"+f_num+" & "+s_num+" is"+(f_num>s_num?f_num/s_num:s_num/f_num));
		break;

	case'*' :
		System.out.println("multi of "+f_num+" & "+s_num+" is "+(f_num*s_num));

	default : 
		System.out.println("Enter valid sign");


		}


	}
	

}