class A {
    private int i = 10;
    final static int j = 20;

  class B   {
    public void m1(){
        System.out.println(i);
        System.out.println(j);
    }    
    }
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.m1();
    }
}

