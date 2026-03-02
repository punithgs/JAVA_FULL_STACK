interface Square {
    int square(int i);
}
public class Lamda {
    public static void main(String[] args) {

        Square s = (a) -> {
            return a * a;
        };

        System.out.println(s.square(10));
    }
}
