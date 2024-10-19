import java.util.*;
class Demo{

	static public void main(String args[]){

	Scanner sc = new Scanner(System.in);

	int arr[] = {10,20,50,30,40};

	int max = 0;
	for(int i = 0; i<arr.length; i++){
		if(max < arr[i]){
			max = arr[i];

			}


		}
			System.out.println(max);
	}


}