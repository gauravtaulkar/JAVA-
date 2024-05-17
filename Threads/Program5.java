class MyThread extends Thread{

      public void run(){
            for(int i=0;i<10;i++){
            System.out.println(currentThread());
            }
      }
}
class ThreadDemo{
      public static void main(String []args){

            MyThread obj= new MyThread();
            obj.start();
      }
}