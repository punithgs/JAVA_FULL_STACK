interface I2 {
    void m1(int i, int j); // passing two arguments
}

public class Lamda2 {
    public static void main(String[] args) {
        
        I2 i2 = (a,b) -> System.out.println(a + " , " + b);
        i2.m1(10,20);
    }
    
}
