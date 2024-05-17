class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}

}
class ThreadDemo{

	public static void main(String []args)throws InterruptedException{

		MyThread obj= new MyThread();
		Thread t1= new Thread(obj);
		t1.start();
		for(int i=1; i<11;i++){
			Thread.sleep(1000);
			System.out.println(Thread.currentThread());
		}
	}
}
