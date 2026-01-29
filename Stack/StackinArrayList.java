class Stack 
{
    private Object[] arr;
    private int count = 0;

    public Stack() 
    {
        arr = new Object[10]; 
    }

    public void push(Object ele) 
    {
        if (count == arr.length) 
        {
            
            Object[] Arr = new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) 
            {
                Arr[i] = arr[i];
            }
            arr = Arr;
        }
        arr[count++] = ele;
    }

    public Object pop() 
    {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        Object key = arr[count - 1];
        arr[--count] = null; 
        return key;
    }

    public Object peek() 
    {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return arr[count - 1];
    }

    public boolean isEmpty() 
    {
        return count == 0;
    }

    public int size() 
    {
        return count;
    }

    @Override
    public String toString() 
    {
        if (isEmpty()) return "[]";
        String s = "[";
        for (int i = count - 1; i >= 0; i--) { // top element first
            s += arr[i];
            if (i != 0) s += ",";
        }
        return s + "]";
    }
}

public class StackinArrayList 
{
    public static void main(String[] args) 
    {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println(s.pop());   // 50
        System.out.println(s);         // [40,30,20,10]
        System.out.println(s.peek());  // 40
        System.out.println(s.isEmpty());// false
        System.out.println(s.pop());   // 40

        System.out.println("==================");

        while (!s.isEmpty()) 
        {
            System.out.println(s.pop());
        }

        System.out.println(s); // []
    }
}
