class Program9{
	public static void main(String[] args){
		int a=1;
		for(int i =1; i<=3; i++){
			char ch='C';
			int num=3;
			for (int j=1; j<=3; j++){
				System.out.print(a*a);
				System.out.print(ch--);
				System.out.print(num-- +"  ");
				a++;
			}

			System.out.println();
		}
	}
}
