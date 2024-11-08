import java.util.*;
class Demo{

	static public void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	int num = sc.nextInt();
	
	int temp;
	int rem;
	int fact;
	int sum = 0;
	
	for(int i = 1; i<= num; i++){
		temp = i;
		sum = 0;

		while(temp > 0){
			rem = temp % 10;
			fact = 1;
			for(int j = 1; j <= rem; j++){
				fact *= j;

				}
				sum += fact;
				temp /= 10;

			}
			if(sum == i){

				System.out.print(i+ "  ");

			}
	

		}


	}

}