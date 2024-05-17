class Singleton{
	static Singleton obj= new Singleton();
	private Singleton(){
		System.out.println("In constructor");
	}
	static Singleton returnObj(){
		return obj;
	}
}
class client{
	public static void main(String []args){
		Singleton obj =Singleton.returnObj();
		Singleton obj2= Singleton.returnObj();	
		System.out.println(obj);	
		System.out.println(obj2);	
	}
}
