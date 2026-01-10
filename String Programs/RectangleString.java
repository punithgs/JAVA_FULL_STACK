class Rectangle {
 
    int length;
    int breadth;

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    @Override
    public boolean equals(Object arg){
        if(!(arg instanceof Rectangle)) return false;
        Rectangle r = (Rectangle) arg;
        return length == r.length && breadth == r.breadth;
    }
}
    public class RectangleString {
        public static void main(String[] args) {
            
            Rectangle r1 = new Rectangle(10, 20);
            Rectangle r2 = new Rectangle(1, 30);
            Rectangle r3 = new Rectangle(10, 20);
            System.out.println(r1.equals(r2));
            System.out.println(r1.equals(r3));
        }    
    }
    

