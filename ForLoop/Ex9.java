class Ex9{
	public static void main(String[] args){
		int n=942111423;
		int rem=0;
		for(;n!=0;){
			rem=rem*10+n%10;
			n=n/10;
		}
		System.out.println(rem);
	}
}
