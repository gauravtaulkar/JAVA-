// PRIME NO. BETWEEN 1 TO 100
class Problem3{ 
	public static void main(String[] args){
		int count=0;
		int x=1000;
		int n=1;
		while(n<=x){
			for(int i=1; i<=n;i++){

				if(n%i==0){
					count++;
				}
			}
			if (count==2){
				System.out.println(n);
			}
			count=0;
			n++;
		}


	}
}
