import java.util.function.Consumer;

public class Consumer1 {

    public static void main(String[] args) {
        
        Consumer<String> c = i -> System.out.println(" My Name is " + i);

        c.accept("Ram");
        c.accept("Sita");
    }
}

// consumer is a inteface 
// accept is method (   accept();  )