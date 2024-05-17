//program of java if no. is below 5 then it print spelling of that no. if greater it print the no. is greater
class Problem4{
	public static void main(String[] args ){
	int var = -6;
	if(var<=5 && var>=0){
	       	if(var==1){
		System.out.println("one");
		}
		else if(var==2){ 
		System.out.println("two");
		}
		else if(var==3){
		System.out.println("three");
		}
		else if(var==4){
		System.out.println("four");
		}
		else if(var==5){
		System.out.println("five");
		}
		else{
		System.out.println("zero");
		}	
	}
	else if(var>5){
	System.out.println("the number is greter than 5");
	}
	else{
	System.out.println("the number is negitive");
	}

	}
}
