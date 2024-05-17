class Outer {
    class Inner {
        void m1() {
            System.out.println("Inner");
        }
    }

    void m2() {
        System.out.println("Outer");
    }

    public static void main(String [] args){
        Inner obj= new Outer().new Inner();
        obj.m1();
    }
}
