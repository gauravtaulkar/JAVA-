interface Demo{
    static int x=7;
    void fun();
    default void gun(){
        System.out.println("In void gun");
    }
}
class Demochild implements Demo{
    int x=8;
    @Override
    public void fun() {
        System.out.println(Demo.x);
    }
}
class client{
    public static void main(String[]args){
        Demo obj= new Demochild();
        System.out.println(obj.x);
        obj.fun();
        obj.gun();
    }
}