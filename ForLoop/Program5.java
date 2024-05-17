//COMPOSITE NO. FROM 1 TO 100
class Program5 {
	public static void main(String[] args) {
		int n=100;
		int count=0;
		for(int i=1; i<=n; i++){
			for(int a=1;a<=100;a++){
				if(i%a==0){
					count++;
				}
			}
			if(count>2){
				System.out.println(i);
			}
			count=0;
		}
	}
}
