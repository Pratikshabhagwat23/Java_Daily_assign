import java.util.*;
class Demo{

	static public void main(String args[]){
	int[] arr = {1,2,3,4,5};

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter value to search : ");

	int target = sc.nextInt();

	boolean found = false;

	for(int element : arr){
		if(element == target){
			found = true;
			break;

			}
		}

		if(found){
			System.out.println("Found");

		} else {

			System.out.println("Not found");

		}
	
	}


}