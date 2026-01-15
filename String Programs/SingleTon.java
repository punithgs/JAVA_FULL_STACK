 class Single {
    public static Single s = null;
    private Single()
    {

    }
    public static Single getInstance()
    {
        if (s == null) {
            s = new Single();
        }
        return s;
    }
 }
 public class SingleTon {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
