class Code{

	static public void main(String[]args){
	char ch = 'A';
	for(int i = 1; i<=4; i++){
		for(int j = 0; j<=4-i; j++){
			System.out.print(ch+"  ");
			ch++;

			}
			System.out.println();
			ch = 'A';
		}

	
	}

}