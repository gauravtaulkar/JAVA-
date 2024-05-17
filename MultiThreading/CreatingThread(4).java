class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());
	}

}
class ThreadDemo{

	public static void main(String []args){

		MyThread obj= new MyThread();
		Thread t1= new Thread(obj,"Gaurav");
		t1.setName("Thor");
		t1.start();
		Thread.currentThread().setName("Ironman");
		for(int i=1; i<11;i++){
			
			System.out.println(Thread.currentThread());
		}
	}
}
