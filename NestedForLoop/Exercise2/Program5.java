class Program5{
	public static void main(String[] args){
		int a=26;
		char ch ='z';
		for(int i =1; i<=4; i++){
			        
			for (int j=1; j<=4; j++){
				if(j%2==1){
				System.out.print(a-- +" ");
				}
				else{
				System.out.print(ch-- +" ");
				}
			}

			System.out.println();
		}
	}
}
