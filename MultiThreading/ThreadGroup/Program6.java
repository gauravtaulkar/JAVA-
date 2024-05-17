//using runnable interface

class MyThread implements Runnable{

	public void run(){
		
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		}	
	}
}
class ThreadGroupDemo{

	public static void main(String []args){

		ThreadGroup Ptgp= new ThreadGroup("India");
		MyThread obj1= new MyThread();
		MyThread obj2= new MyThread();
		Thread t1= new Thread(Ptgp,obj1,"maha");

		Thread t2= new Thread(Ptgp,obj1,"goa");
		t1.start();
		t2.start();
	}
}
