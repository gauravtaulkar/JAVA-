//STRONG NUMBER BETWEEN 1 TO 1000000
class Program7 {
	public static void main(String[] args) {
		int n=0;
		int sum=0;
		int a=1;
		for (int i=1; i<=1000000; i++){
			 n=i;
			 while(n!=0){
				 int rem=n%10;
				 a=1;
				 for(int j=1; j<=rem; j++){
					 a=a*j;
				 }
				 sum=sum+a;
				 n=n/10;
			 }
			 if(sum==i){
				 System.out.println(i);
			 }
			 sum=0;
		}

	}
}
