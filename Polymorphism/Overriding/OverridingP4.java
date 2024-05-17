class parent{
    parent(){
        System.out.println("in parent constructor");
    }
    void fun(){
        System.out.println("in parent fun");
    }
}
class child extends parent{
    child(){
        System.out.println("int child constructor");
    }
    void fun(int x) {
        System.out.println("in child fun");
    }
}
class client{
    public static void main(String[]ards){
        parent obj1=new child();
        obj1.fun();
    }
}