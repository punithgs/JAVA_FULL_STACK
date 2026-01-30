class Node {
    Object ele;
    Node next;

    Node(Object ele) {
        this.ele = ele;
        this.next = null;
    }
}
class Queue {
    private Node first;
    private Node last;
    private int count = 0;

    // Enqueue
    public void add(Object ele) {
        Node n = new Node (ele);
        if (first == null){
            first = n;
            count++;
            return;
        }
        Node curr = first;
        while (curr.next != null) 
            curr = curr.next;
            curr.next = n;
            count++;
    }

    // Dequeue
    public Object poll() {
        Object key = first.ele;
        first = first.next;
        count--;

        if (first == null)
            last = null;

        return key;
    }

    public Object peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");

        return first.ele;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}

public class QueueImplementation {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q.poll()); // 10
        System.out.println(q.peek()); // 20
        System.out.println(q.isEmpty()); // false

        System.out.println("===========================");

        while (!q.isEmpty())
            System.out.println(q.poll());

        System.out.println("===========================");
        System.out.println(q.isEmpty()); // true
    }
}




/*class Node {
    Object ele;
    Node next;

    Node (Object ele) {
        this.ele=ele;
    }
    public Node (Object ele, Node next) {
        this.ele=ele;
        this.next=next;
    }
}

class Queue{
    Node first;
    int count = 0;

    public void add(Object ele)
    {
        Node n = new Node (ele);
        if (first == null){
            first = n;
            count++;
            return;
        }
        Node curr = first;
        while (curr.next != null) {
            curr = curr.next;
            curr.next = n;
            count++;
        }
        public Object poll(){
            Object key = first.ele;
            first = first.next;
            count--;
            return key;
        }
        public Object peek(){
            return first.ele;
        }
        public int size()
            {
                return count;
            }
        }
        public boolean isEmpty(){
            return count == 0;
        }
    }
public class QueueImplementation {
    public static void main(String[] args) {
         Queue q = new Queue();
         q.add(10);
         q.add(20);
         q.add(30);
         q.add(40);
         q.add(50);
         System.out.println(q.poll());
         System.out.println(q.peek());
         System.out.println(q.isEmpty());
         System.out.println("===========================");
         while (!q.isEmpty())
            System.out.println(q.poll());
        System.out.println("===========================");
        System.out.println(q.isEmpty());   
         }
    }
    */

