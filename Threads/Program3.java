class MyThread extends Thread{

    public void run(){
        Demo obj2= new Demo();
        obj2.start();
        System.out.println(Thread.currentThread());
    }
}
class Demo extends Thread{
    public void run(){

        System.out.println(Thread.currentThread());

    }
}

class ThreadDemo{
    public static void main(String [] args) {
        
        MyThread obj = new MyThread();
        obj.start();
        System.out.println(Thread.currentThread());

    }
}

