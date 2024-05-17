class ConcatDemo{
	public static void main(String [] args){
		String str1="core2";
		String str2="web";
		String str3=myConcat(str1,str2);
		System.out.println(str3);


	}
	 static String myConcat(String str1,String str2){
		String str3=str1+str2;
		return str3;
	}


}
