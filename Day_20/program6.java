import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter num in array : ");
	int n = sc.nextInt();

	int[] arr = new int[n];
	System.out.println("Enter number : ");
	for(int i = 0; i<n; i++){
		arr[i] = sc.nextInt();

		}
		int smallest = arr[0];
		for(int i = 1; i<n; i++){
			if(arr[i]< smallest){
				smallest = arr[i];

			}

		}
		System.out.println("the smallest : " +smallest);			

	}


}