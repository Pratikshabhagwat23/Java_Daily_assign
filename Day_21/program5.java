import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size of array : ");
	int size = sc.nextInt();

	int []arr = new int [size];

	System.out.println("Enter array elements : ");

	for(int i = 0; i< size; i++){
		System.out.println("Element : "+(i + 1) +"  ");
		arr[i] = sc.nextInt();
		
		}
		int sum = 0;
		for(int i = 0; i< size; i++){
			sum += arr[i];

		}
		System.out.println("print sum : " +sum);

	}



}
