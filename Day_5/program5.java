//write a java program to print the following patter * 1 * 2


class Demo{

	static public void main(String[]args){
	int a =1;
	for(int i = 1; i<=3; i++){
		for(int j = 1; j<=4; j++){
			if(j % 2 ==0){
				System.out.print(a+"  ");
				a++;
			} else {
				System.out.print("* ");
				
				}
			
			}
				System.out.println();
		}

	}

}