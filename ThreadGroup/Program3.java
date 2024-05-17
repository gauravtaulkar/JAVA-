class MyThread extends Thread{

	MyThread(ThreadGroup tg,String str){
	
		super(tg,str);
	}
	public void run(){

		System.out.println(currentThread());
	}

}
class ThreadGroupDemo{

	public static void main(String []agrs){
		
		ThreadGroup tgp= new ThreadGroup("Core2Web");

		MyThread obj1 = new MyThread(tgp,"Java");
		MyThread obj2 = new MyThread(tgp,"C");
		MyThread obj3 = new MyThread(tgp,"C++");

		obj1.start();
		obj2.start();
		obj3.start();
		
		ThreadGroup tgc= new ThreadGroup(tgp,"Incubator");
			
		MyThread obj4 = new MyThread(tgc,"Flutter");
		MyThread obj5 = new MyThread(tgc,"Reactjs");
		MyThread obj6 = new MyThread(tgc,"Springboot");


		obj4.start();
		obj5.start();
		obj6.start();
	}
}
