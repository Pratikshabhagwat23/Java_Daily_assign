import java.util.*;
class Demo{

	public static void main(String args[]){

	int arr[] = new int[5];

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter array element : ");
	for(int i = 0; i<=arr.length; i++){
		arr[i] = sc.nextInt();
		}
	System.out.println("Even elements : ");
		for(int i = 0; i<=arr.length; i++){
			if(arr[i] % 2 == 0){
				System.out.println(arr[i]+"  ");
	
			}
	
		}	
		System.out.println();

	System.out.println("Odd elemnts : ");
		for(int i = 0; i<=arr.length; i++){
			if(arr[i] % 2 == 1){
				System.out.println(arr[i]+"  ");

			}

		}
			System.out.println();
	}


}