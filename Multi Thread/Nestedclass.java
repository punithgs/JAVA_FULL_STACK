class A{
    static int i = 10;
    int j = 20;

    static class B  {
        public void m1()
        {
            System.out.println(i);
            //System.out.println(j); // CTE
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Main of - B");
    }
}
 public static void main(String[] args) {
    A.B b = new A.B();
    b.m1();
    System.out.println("Main of - A");
 }

