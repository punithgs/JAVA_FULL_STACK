class StringMethodsExample {
    public static void main(String[] args) {

        String s1 = "Java Programming";
        String s2 = "JAVA";
        String s4 = "123";

        // length()
        System.out.println("Length: " + s1.length());

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // charAt()
        System.out.println("Character at index 2: " + s1.charAt(2));

        // equals() and equalsIgnoreCase()
        System.out.println("Equals: " + s2.equals("JAVA"));
        System.out.println("Equals Ignore Case: " + s2.equalsIgnoreCase("java"));

        // contains()
        System.out.println("Contains 'Java': " + s1.contains("Java"));

        // substring()
        System.out.println("Substring: " + s1.substring(0, 4));

        // replace()
        System.out.println("Replace: " + s1.replace("Java", "Python"));

        // trim()
        String s3 = "  Hello  ";
        System.out.println("Trimmed: '" + s3.trim() + "'");

        // concat()
        System.out.println("Concat: " + s2.concat(" Language"));
  
        System.out.println(Integer.parseInt(s4));

    }

}
