//PROGRAM FOR PALENDROME NUMBER FROME 1 TO 1000
class Program6 {
	public static void main(String[] args) {
		int n=0;
		int rem=0;
		for(int i=1; i<=10000; i++){
			n=i;
			while (n!=0){
				rem= rem*10+n%10;
				n=n/10;
			}
			if(rem==i){
				System.out.println(i);
			}
			rem=0;
		}
	}
}
