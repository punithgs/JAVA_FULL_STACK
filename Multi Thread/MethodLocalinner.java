public class MethodLocalinner {
    public static void main(String[] args) {
        
        class A {
            public void add (int a, int b) {
                System.out.println(a+b);
            }
        }
        A a = new A();
        a.add(30, 20);
    }  
}
