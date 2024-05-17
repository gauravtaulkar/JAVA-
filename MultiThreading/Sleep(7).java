class MyThread extends Thread{

	public void run(){

		for(int i= 1;i<11;i++){ 

			System.out.println(Thread.currentThread());
			try{
			sleep(1000);
			}catch(InterruptedException ie){
		
			}
		}
	}

}
class ThreadDemo{

	public static void main(String []args)throws InterruptedException{

		MyThread obj= new MyThread();
		obj.setPriority(9);
		obj.start();
		
		for(int i=1; i<11;i++){
			Thread.sleep(1000);
			System.out.println(Thread.currentThread());
		}
	}
}
