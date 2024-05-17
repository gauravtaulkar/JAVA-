class Program4 {
	public static void main(String[] args) {
		int rem = 0;
		int n=0;

		for (int i = 10; i <= 1000; i++) {
			 n=i;
			 for (; n != 0; ) {
				 rem = rem * 10 + n % 10;
				 n = n / 10;
			 }
			 if ( i== rem) {
				 System.out.println(i);
			 }
			 rem=0;

		}
	}
}
