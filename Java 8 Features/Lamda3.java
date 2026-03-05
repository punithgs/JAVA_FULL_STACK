interface I3 {
    int m1(int i, int j);
}

public class Lamda3 {
    public static void main(String[] args) {

        I3 i3 = (a, b) -> {
            return a + b;   // using return type
        };

        I3 i4 = (a, b) -> a + b;

        System.out.println(i3.m1(10, 20));
        System.out.println(i4.m1(50, 10));
    }
}
