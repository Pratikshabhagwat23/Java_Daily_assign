import java.util.*;
class Demo{

	static public void main(String args[]){
	int n;

	System.out.println("Enter size : ");

	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();

	int arr[] = new int[n];

	System.out.println("Enter array element : ");

	for(int i = 0; i < n; i++){
		arr[i] = sc.nextInt();

		}

		System.out.println("Element of array in reverse : ");

		for(int i = 0; i< n; i++){
			System.out.print(arr[n - i - 1]+" ");

		}

	}


}