class CircletoS {
    int radius ;

// Constructor to initialize radius

    public CircletoS(int r) {
        radius = r;
    }

    // Override toString() method to provide a readable representation

        @Override
        public String toString()
        {
        return "Circle [ radius = " +radius + "]" ;
        }

    // Add main inside Circle
        public static void main(String[] args) {
            CircletoS c = new CircletoS(5);    //Create Circle object with radius 5
            System.out.println(c);         // Implicitly calls toString()
        }
}
