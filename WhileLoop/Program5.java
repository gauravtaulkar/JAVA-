//Factorial of following input
class Program5{
	public static void main(String[] args) {
		int n=8;
		int i=1;
		while(i<=n){
			int rem=n%i;
			if(rem==0){
			System.out.println(i);
			}
			i++;
		}
	}
}

