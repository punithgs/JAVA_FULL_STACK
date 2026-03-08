import java.util.Scanner;
import java.util.function.Supplier;

public class Supplier1 {

    int i;

    public Supplier1(int i) {
        this.i = i;
    }

    public static void main(String[] args) {

        Supplier<Supplier1> sp =
                () -> new Supplier1(new Scanner(System.in).nextInt());

        Supplier1 a1 = sp.get();
        Supplier1 a2 = sp.get();

        System.out.println(a1.i);
        System.out.println(a2.i);
    }
}


// Supplier is a interface
// get is a method ((.  get();  ))
// whatever enter user that only output of this code
