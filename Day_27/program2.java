import java.util.*;
class Demo{

	static public void main(String args[]){
	
	int [] bin = new int[3];

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter octal number : ");

	String arr = sc.next();
	
	int n;
	int k;
	int rem;

	int leng = arr.length();

	System.out.println("leng : "+leng);

	for(int i = 0; i <leng; i++){
		n = arr.charAt(i) - 48;
		k = 0;
		bin[2] = 0;
		bin[1] = 0;
		bin[0] = 0;

		while(n != 0){
			rem = n % 2;
			bin[k] = rem;
			k++;
			n = n /2;

			}

			System.out.print(bin[2]+ " "+bin[1]+ " "+bin[0]);
		}

	}

}