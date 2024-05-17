class Ex10{
	public static void main(String[] args){
		int n=211113;
		int temp=n;
		int rem=0;
		for(;n!=0;){
			rem=rem*10+n%10;
			n=n/10;
		}
		if(rem==temp){
			System.out.println("palindrome Number");
		}
		else{
			System.out.println("not palindrome Number");
		}
	}
}
