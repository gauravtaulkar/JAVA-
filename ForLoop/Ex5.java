//SQUARE OF EVEN DIGIT IN NUMBER
class Ex5{
	public static void main(String[] args){
		int n=942111423;
		int count=0;
		for(; 0!=n;){
			int rem=n%10;
			if (rem % 2 == 0){
				System.out.println(rem*rem);
			}
			n=n/10;
		}
		System.out.println(count);
	}
}
