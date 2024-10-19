class Demo{

	static public void main(String args[]){
	
	int[] array1 = {1,2,3};
	int[] array2 = {4,5,6};

	int[] mergeArray = new int[array1.length + array2.length];

	for(int i = 0; i < array1.length; i++){
	mergeArray[i] = array1[i];

	}

	for(int i = 0; i < array1.length; i++){
	mergeArray[array1.length + i] = array2[i];


	}

	System.out.println("Merge array : ");
	for(int i = 0; i < mergeArray.length; i++){
		System.out.println(mergeArray[i]);
	}
	System.out.println();

	}


}