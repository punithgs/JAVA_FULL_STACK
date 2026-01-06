class Circle {
    int radius;
    
    public Circle (int r)
    {
        radius = r;
    }
    @Override
    public boolean equals (Object arg)
    {
        if (! (arg instanceof Circle) )
        return false;
        return this.radius == ((Circle) arg).radius;
    }
    @Override
    public String toString()
    {
        return "Circle [ radius = " +radius + "]";
    }
}
public class Circleequals{
public static void main (String[] args)
{
    Circle c = new Circle(3);
    Circle c1 = new Circle(3);
    System.out.println(c == c1);
    System.out.println(c.equals(c1));
}
}
