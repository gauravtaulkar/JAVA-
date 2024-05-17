interface Demo{
    static int x=7;
    static void fun(){
        System.out.println("interface" );
    }
    default void gun(){
        System.out.println("In void gun");
    }
}
class Demochild implements Demo{
    int x=8;
}
class client{
    public static void main(String[]args){
        Demo obj= new Demochild();
        System.out.println(obj.x);
        Demo.fun();
        obj.gun();
    }
}