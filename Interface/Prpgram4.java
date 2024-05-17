interface Demo{
    void fun();
    default void gun(){
        System.out.println("In void gun");
    }
}
class Demochild implements Demo{

    @Override
    public void fun() {
        System.out.println("Int void fun");
    }

}
class client{
    public static void main(String[]args){
        Demochild obj= new Demochild();
        obj.fun();
        obj.gun();
    }
}