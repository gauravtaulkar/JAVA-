//creating Threds using Thread class
class MyThread extends Thread{

	public void run(){

		for(int i=0; i<10;i++){
			System.out.println("In run");	
		}
	}
}
class ThreadDemo
{
	public static void main(String []arg)throws InterruptedException{
	
		MyThread obj= new MyThread();
		obj.start();

		for(int i=0;i<10;i++){
			System.out.println("in main");
			Thread.sleep(500);
		}		

	}
}
