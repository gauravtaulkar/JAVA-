// COUNT THE NUMBER
class Ex3{
	public static void main(String[] args){
		int n=942111423;
		int count=0;
		for(; 0!=n;){
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}
