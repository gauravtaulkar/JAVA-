class Program10{
	public static void main(String[] args){

		for(int i =1; i<=6; i++){
			int num=5;
			char ch ='f';
			
			for (int j=1; j<=6; j++){
				if(j%2==1){
				System.out.print(ch-- +"  ");
				ch--;
				}
				else{
				System.out.print(num-- +"  ");
				num--;
				}
				 
			}

			System.out.println();
		}
	}
}
