//PROGRAM FOR STRONG NO.
class Program2{
	public static void main(String [] ars){
	int sum=0;
	int n=185;
	int a=1;
	int temp1=n;
	while(n!=0){
		int rem=n%10;
		a=1;
		for(int i=1; i<=rem; i++){
			a=a*i;
		}
		sum=sum+a;
		n=n/10;
	}
	if (sum==temp1){
	System.out.println("Strong no.");
	}
	else{
	System.out.println("not strong no.");
	}
	}
}
