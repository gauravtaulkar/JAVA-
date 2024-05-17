class Ex6{
	public static void main(String[] args){
		int sum=0;
		int multi=1;
		for(int i=1; i<=10; i++) {

			if (i % 2 == 0) {
				sum=sum+i;
			}
			else if(i%2!=0){
				multi=multi*i;
			}
		}
		System.out.print("sum of even number is ");
		System.out.println(sum);
		System.out.print("multiplication of odd number is ");
		System.out.println(multi);
	}
}
