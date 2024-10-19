import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Num : ");
	int num = sc.nextInt();

	System.out.println("odd numbers in reverse order");
	
	if(num % 2 == 0){
		num--;

		}	
	
	for(int i = num; i> 0; i -=2){
		System.out.print(i+" ");
	
		}

	}



}