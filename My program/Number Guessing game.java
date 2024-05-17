import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
       int num= random.nextInt(100);
     //  System.out.println(num);
       System.out.println("Guess the number between 1 to 100");
       int x=sc.nextInt();
       int count=1;
       for(int i=0; i<=100 ;i++){
           if(num<x){
               System.out.println("it is greater than the Mystery number");
               x=sc.nextInt();
           }
           else if(num>x){
               System.out.println("it is less than the Mystery number");
               x=sc.nextInt();
           }
           else{
               System.out.println("congratulation you found out the number in "+ count + " chances");
               break;
           }
           count++;
       }

    }
}
