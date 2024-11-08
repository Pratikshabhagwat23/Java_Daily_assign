class Demo{

	static public void main(String args[]){
	int count;
	for(int i = 0; i< 4; i++){
	count = 0;
		for(int j = 0; j< 4; j++){
		if(j < 3 - i){
			System.out.print("  ");

			}
			
			else {
				if(count == 0){
					System.out.print("= ");

				} else {
					System.out.print(count+" ");
					
				
				}
				count++;
			}

				
		}
				System.out.println();
	}
}
}