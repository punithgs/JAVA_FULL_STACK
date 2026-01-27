class Node {
    Object ele;
    Node next;

    Node(Object ele) {
        this.ele = ele;
        this.next = null;
    }
}
class Stack {
    private Node first;
    private int count = 0;

    public void push(Object ele) {
        Node n = new Node (ele);
        if(first == null) {
            first = n;
            count++;
            return;
        }
        n.next = first;
        first = n;
        count++;
        return;
    }

    public Object pop() {
        Object key = first.ele;
        first = first.next;
        count--;
        return key;
    }

    public Object peek() {
        return first.ele;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";

        String s = "[";
        Node curr = first;
        while (curr != null) {
            s += curr.ele;
            if (curr.next != null) s += ",";
            curr = curr.next;
        }
        return s + "]";
    }
}

public class StackImplementation {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s.pop());   // 50
        System.out.println(s);         // [40,30,20,10]
        System.out.println(s.peek());  // 40
        System.out.println(s.isEmpty());// false
        System.out.println(s.pop());   // 40

        System.out.println("==================");

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        System.out.println(s); // []
    }
}

/*class Stack {
    Node first;
    int count = 0;

    public void push (Object ele)
    {
        Node n = new Node (ele);
        if(first == null) {
            first = n;
            count++;
            return;
        }
        n.next = first;
        first = n;
        count++;
        return;
    }
    public Object pop(){
        Object key = first.ele;
        first = first.next;
        count--;
        return key;
    }

    public Object peek ()
    {
        return first.ele;
    }
    public int size()
    {
        return count;
    }
    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString() {
        if (size() == 0) return "[]";
        String s = "[" + arr[0];
        for (int i = 1; i < size(); i++) {
            s += "," + arr[i];
        }
        return s + "]";
    }
}


public class StackImplementation {

   public static void main(String[] var0) {
      Stack var1 = new Stack();
      var1.push(10);
      var1.push(20);
      var1.push(30);
      var1.push(40);
      var1.push(50);
      System.out.println(var1.pop());
      System.out.println(var1);
      System.out.println(var1.peek());
      System.out.println(var1.isEmpty());
      System.out.println(var1.pop());
      System.out.println("==================");

      while(!var1.isEmpty()) {
      }

      System.out.println(var1);
      System.out.println();

      while(!var1.isEmpty()) {
         System.out.println(var1.pop());
      }

   }
}
   */
