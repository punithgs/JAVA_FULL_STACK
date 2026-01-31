class QueueInArray {
    private Object[] arr;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public QueueInArray(int capacity) {
        arr = new Object[capacity];
    }

    public void add(Object ele) {
        if (count == arr.length) { 
            throw new RuntimeException("Queue is full");
        }
        arr[rear++] = ele;
        count++;
    }

    public Object poll() 
    {
        if (isEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
        Object key = arr[front++];
        count--;
        return key;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        String s = "[";
        for (int i = front; i < rear; i++) {
            s += arr[i];
            if (i != rear - 1) s += ",";
        }
        return s + "]";
    }
}


public class QueueLinearTest {
    public static void main(String[] args) {
        QueueInArray q = new QueueInArray(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);          // [10,20,30,40,50]
        System.out.println(q.poll());   // 10
        System.out.println(q.peek());   // 20
        System.out.println(q.isEmpty());// false

        System.out.println("==================");

        while (!q.isEmpty())
            System.out.println(q.poll());

        System.out.println("==================");
        System.out.println(q.isEmpty()); // true

        // Uncommenting next line will throw "Queue is full" if array is full
        // q.add(60);
    }
}


/*class QueueinArray{

    private Object[] arr;
    private int count = 0;
    private int front = 0;
    private int rare = 0;

    Queue (int cap){
        arr = new Object[cap];
    }
    public void add (Object e){
        if (count == arr.length){
            throw new RuntimeException("Queue is full");
        }
        arr [rare++] = e;
        count++;
    }
    public Object poll(){
        if (isEmpty())
        {
            throw new RuntimeException("U");
        }
        count--;
        return all [front++];
    }
    public Object peek(){
        if (isEmpty()){
            throw new Exception("queue");
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public int size(){
        return count;
    }
 }

public class QueueInArrayList {
    
}
*/