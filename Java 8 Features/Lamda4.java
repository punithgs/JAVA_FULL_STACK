interface Even {
    boolean isEven(int i);
}

public class Lamda4 {
    public static void main(String[] args) {

        Even e = i -> i % 2 == 0;

        System.out.println(e.isEven(6)); // true
        System.out.println(e.isEven(7)); // false
    }
}

