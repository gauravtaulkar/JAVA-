class Outer {
    static class Inner {
        void m1() {

            System.out.println("Inner");
        }
    }
    void m2() {

        System.out.println("Outer");
    }
}
class client{
    public static void main(String [] args ){
       Outer.Inner obj= new Outer.Inner();
       obj.m1();
       outer obj2 = new Outer();
       obj2.m2();

    }

}
