class Demo{

	static public void main(String args[]){
	char ch = 'A';
	int inc;	
	for(int i = 0; i < 4; i++){
	 inc = 0;
		for(int j = 0; j<4-i; j++){
			System.out.print((char)(65 + i + inc) + "  ");
			inc  +=2;
			}
			System.out.println(" ");

		}
	

	}


}