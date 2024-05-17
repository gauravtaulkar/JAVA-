//FIND ODD NUMBERS IN FOLLOWING INLPUT
class Program4{
	public static void main(String[] args){
	
		int n=34848756;
		int count=0;
		while(n!=0){
			int rem= n%10;
			n=n/10;
			if(rem%2!=0){
			count++;
			}
		
		}
		System.out.println(count);
	}
}
