class Node {
    Object ele;
    Node next;

    public Node(Object e, Node n) {
        ele = e;
        next = n;
    }
}

class SingleLinkedList {
    private Node first = null;
    private Node last = null;
    private int count = 0;

    public void add(Object e) {
        Node n = new Node(e, null);
        if (first == null) {
            first = last = n;
        } else {
            last.next = n;
            last = n;
        }
        count++;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            first = new Node(e, first);
            if (count == 0) last = first;
            count++;
            return;
        }

        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = new Node(e, curr.next);
        if (curr.next.next == null) last = curr.next;
        count++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        Node curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.ele;
    }

    public void remove(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            first = first.next;
            if (first == null) last = null;
            count--;
            return;
        }

        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next == null) last = curr;
        count--;
    }

    public void reverse() {
        Node prev = null;
        Node curr = first;
        Node next;

        last = first;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        first = prev;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        if (size() == 0) return "[]";
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

public class SinleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();

        System.out.println(s);
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        System.out.println(s);
        s.add(0, 100);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
    }
}


/*class Node {
    Object ele;
    Node Next;
    public Node (Object e, Node n)
{
this.ele = e;
this.Next = n;
}
}

class LinkedList_demo1{
    public static void main(String[] args) {
        
        Node first = null;
        first = new Node(10, null);
        first.Next = new Node(20, null);
        first.Next.Next = new Node(30, null);
        first.Next.Next.Next = new Node(40, null);

        Node curr = first;
        while ((curr != null)) {

            System.out.println(curr.ele);
            curr = curr.Next;
        }
    }

    class LinkedList_demo2 {
        private Node first = null;
        private Node last = null;
        private int count = 0;

        public void add(Object e) {
            if(first == null){
                first = new Node(e, null);
                last = first;
                count++;
                return;
            }

            last.Next = new Node(e,null);
            count++;
            last = last.Next;
        }
        public int size(){
            return count;
        }

        public Object get (int index){
            if (index <= -1 || index >= size()){
                throw new IndexOutOfBoundsException();
            }
            Node.curr = first;
            for (int i = 1; i <= index; i++){
                curr = curr.Next;
            }
            return curr.ele;
        }
    }
    public void add(int index, Object e) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            first = new Node(e, first);
            count++;
            return;
        }
        Node curr = first;
        for (int i = 1; i < index; i++){
            curr = curr.Next;
        }
        curr.Next = new Node(e, curr.Next);
        count++;
}
public void remove(int index){
    if (index <= -1 || index >= size())
    {
        throw new IndexOutOfBoundsException();
    }
    if(index == 0){
        first = first.next;
        if(first == null) 
            last = null;
        count--;
    }

    Node curr = first;
    for (int i = 1; i < index; i++){
        curr = curr.Next;
    }
    curr.Next = curr.Next.Next;
    if(curr.Next == null)
        last = curr;
    count--;
    return;
}
public void reverse(){
    Node prev = null;
    Node curr = first;
    Node Next = null;

    while (curr != null) {
        Next = curr.Next;
        curr.Next = prev;
        prev = curr;
        curr = Next;
    }
    last = first;
    first = prev;
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
public class SinleLinkedList {
    public static void main(String[] args) {
        
        SinleLinkedList s = new SinleLinkedList();

        System.out.println(s);
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        System.out.println(s);
        s.add(0,100);
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
    }
    
}
    */

