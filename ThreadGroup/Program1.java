class MyThread extends Thread{

	MyThread(String str){
	
		super(str);
	}
	public void run(){

		System.out.println(getName());
		System.out.println(currentThread().getThreadGroup());
	}

}
class ThreadGroupDemo{

	public static void main(String []agrs){

		MyThread obj = new MyThread("xyz");
		obj.start();
	}
}
