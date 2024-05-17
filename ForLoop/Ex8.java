class Ex8{
	public static void main(String[] args){
		 int n=7;
		 for(int i=n; i>=0; i--){
			 if(i>=1){
				 System.out.print(i);
				 System.out.println(" days remaining");
			 }
			 else if (i==0){
				 System.out.print(i);
				 System.out.println(" days Assignment is overdue ");
			 }
		 }
	}
}

