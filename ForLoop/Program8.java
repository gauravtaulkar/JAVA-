// sTRONG NUMBER 1 TO 100000
class Program8{
	public static void main(String[] args){
		int sum=0;
		int n=100000;
		for(int i=1; i<=n; i++){

			for (int j=1; j<i; j++){
				if(i%j==0){
					sum=sum+j;
				}
			}
			if(sum==i){
				System.out.println(i);
			}
			sum=0;
		}
	}
}
