public class DemoString {
    public static void main(String[] args) {
        
        String s = "Javadeveloper";

        System.out.println(s.charAt(4));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("ev"));
        System.out.println(s.indexOf('e',6));
        System.out.println(s.indexOf("a",7));
        System.out.println(s.lastIndexOf('e'));
    }
}
