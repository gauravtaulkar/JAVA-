class MyThread extends Thread{
	
	public void run(){
		
		for(int i= 1;i<11;i++){ 
			try{
				sleep(1000);
			}catch(InterruptedException ie){
			}

			System.out.println(Thread.currentThread());
		}
	}

}
class ThreadDemo{

	public static void main(String []args)throws InterruptedException{

		MyThread obj= new MyThread();
		obj.start();
		obj.join(1000);
		for(int i=1; i<11;i++){
			Thread.sleep(100);
			System.out.println(Thread.currentThread());
		}
	}
}
