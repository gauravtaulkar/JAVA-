class MyThread extends Thread implements Runnable {

    public void run(){
      System.out.println(Thread.currentThread());
    }
}
class ThreadDemo{

    public static void main(String []args){

        MyThread obj= new MyThread();
        Thread obj2=new Thread(obj);
        obj.start();
        obj2.start();


    }
}