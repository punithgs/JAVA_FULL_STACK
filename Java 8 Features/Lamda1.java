@FunctionalInterface

 interface I1 {
    void m1(int i); // passing only one argument
}

public class Lamda1 {
    public static void main(String[] args) {
        
        I1 i1 = i -> System.out.println(i); // lamda Expresion
        i1.m1(10);
        i1.m1(20);
    }
    
}