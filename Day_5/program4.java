//write a java program to print the following patter * = * = 

class Demo{

	static public void main(String[]args){
	for(int i = 1; i<=3; i++){
		for(int j = 1; j<=4; j++){
			if(j % 2==1){
			System.out.print("=  ");
		} else {
			System.out.print("*  ");

				}
		
			}
			System.out.println("  ");
		}
			
	}

}