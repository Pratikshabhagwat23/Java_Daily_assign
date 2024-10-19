class Pattern{

	static public void main(String[]args){
	char ch = 'A';
	char ch1 = 'a';
	for(int i = 1; i<=5; i++){
		for(int j = 1; j<=i; j++){
			if(i % 2==0){
				System.out.print(ch+"  ");

			} else {
				System.out.print(ch1+"  ");

				}

			}
				System.out.println("  ");
				ch = 'A';
				ch1 = 'a';
		}


	}

}