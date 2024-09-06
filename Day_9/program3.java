class Code{

	static public void main(String[]args){
	char ch = 'A';
	char ch1= 'a';
	for(int i = 1; i<=4; i++){
		for(int j = 0; j<=4-i; j++){
			if(i % 2==1){
				System.out.print(ch+"  ");
				ch++;

			} else {
				System.out.print(ch1+"  ");
				ch1++;

				}

			}
				System.out.println();
				ch = 'A';
				ch1 = 'a';
		}

	}

}