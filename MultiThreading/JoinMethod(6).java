class MyThread extends Thread{
	static Thread tt=null;

	public void run(){
		
		try{
			tt.join();
		}catch(InterruptedException ir){
		
		}
		for(int i= 1;i<11;i++){ 

			System.out.println(Thread.currentThread());
		}
	}

}
class ThreadDemo{

	public static void main(String []args)throws InterruptedException{

		MyThread.tt= Thread.currentThread();
		MyThread obj= new MyThread();
		obj.start();
		obj.join();
		for(int i=1; i<11;i++){
		
			System.out.println(Thread.currentThread());
		}
	}
}
