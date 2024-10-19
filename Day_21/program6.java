import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size : ");
	int size = sc.nextInt();

	int []arr = new int [size];

	System.out.println("Enter array elements : ");
	for(int i = 0; i< size; i++){
		System.out.print("Elements : " +(i + 1) + "  ");
		arr[i] = sc.nextInt();

		}
		System.out.println("Elements in reverse order :");
		for(int i = size - 1; i>= 0; i--){
			System.out.print(arr[i]+"  ");

		}

	}


}