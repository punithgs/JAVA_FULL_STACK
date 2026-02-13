interface I1 {
    void m1();
    }

public class Anomymus {
    public static void main(String[] args) {
        
        I1 i1 = new I1() {
            
            @Override
            public void m1() {
                System.out.println("m1() is Execution");
            }

            public void m2() {
                System.out.println("m2() A ......");
            }
        };
        i1.m1();
        //i1.m2();//CTE
    }
}
