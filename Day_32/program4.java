/*write program to print pattern
           100
	81 64
    49	36 25
16  9   4   1*/

class Demo{

	static public void main(String args[]){
	int num = 10;
	for(int i = 0; i < 4; i++){
		for(int j = 0; j < 4; j++){
			if(j < 3 - i){
				System.out.print("\t");


			} else {
				System.out.print("\t"+num * num);
				num = num - 1;


				}


			}

				System.out.println();

		}


	}

}