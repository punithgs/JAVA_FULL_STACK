class Node {
    Object ele;
    Node next;
    Node prev;

    Node (Object e){
        ele=e;
        next=prev=null;
    }
    Node (Object e, Node p, Node n){
        ele = e;
        next = n;
        prev = p;
    }
}

class MyDoubleLinkedList {

    private Node first;
    private Node last;
    private int count;

    public void add(Object e) {
        if (first == null) {
            first = last = new Node(e);
        } else {
            Node n = new Node(e, last, null);
            last.next = n;
            last = n;
        }
        count++;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            Node n = new Node(e, null, first);
            if (first != null) first.prev = n;
            first = n;
            if (count == 0) last = first;
            count++;
            return;
        }

        if (index == size()) {
            add(e);
            return;
        }

        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        Node n = new Node(e, curr, curr.next);
        curr.next.prev = n;
        curr.next = n;
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
            if (first != null) first.prev = null;
            else last = null;
            count--;
            return;
        }

        if (index == size() - 1) {
            last = last.prev;
            last.next = null;
            count--;
            return;
        }

        Node curr = first;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        curr.next.prev = curr;
        count--;
    }

    public int size() {
        return count;
    }

    public void displayForward() {
        Node curr = first;
        while (curr != null) {
            System.out.print(curr.ele + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node curr = last;
        while (curr != null) {
            System.out.print(curr.ele + " ");
            curr = curr.prev;
        }
        System.out.println();
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
public class DoubleLinkedList {
    public static void main(String[] args) {

        MyDoubleLinkedList s = new MyDoubleLinkedList();

        System.out.println(s);
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println(s);

        s.add(0, 100);
        System.out.println(s);

        s.remove(2);
        System.out.println(s);

        s.displayForward();
        s.displayBackward();
    }
}


/*class Node {
    Object ele;
    Node next;
    Node prev;

    Node (Object e){
        ele=e;
        next=prev=null;
    }
    Node (Object e, Node p, Node n){
        ele = e;
        next = n;
        prev = p;
    }
}

class MyDoubleLinkedList {

    private Node first;
    private Node last;
    private int count ;

    public void add(Object e){
        if (first == null){
            first = new Node(e);
            last = first;
            count ++;
            return;
        }
        last.next = new Node(e,last,null);
        last = last.next;
        count++;
    }

    public Object get (int index){
        if(index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException();
        }

        Node curr = first;
        for (int i = 1; i <= index; i++){
            curr = curr.next;
        }
        return curr.ele;
    }
    public int size()
    {
        return count;
    }

    public void add (Object e, int index){
        if (index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException();
        }

        if(index == 0)
        {
            first = new Node(e,null,first);
            count++;
            return;
        }
        Node curr = first;
        for (int i = 1; i < index; i++){
            curr = curr.next;
        }

        Node n = new Node(e,curr,curr.next);
        curr.next.prev = n;
        count++;
    }

    public void remove (int index){
        if(index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            first = first.next;
            if(first != null) first.prev = null;
            if(first.next == null) last = null;
            count--;
            return;
        }
        if (index == size()-1){
            last.prev.next = null;
            last = last.prev;
            count--;
            return;
        }

        Node curr = first;
        for(int i = 1; i < index ; i++){
            curr = curr.next;
        }
        curr.next.next.prev = curr;
        curr.next = curr.next.next;
        count--;
    }
    public void Display(){
        Node curr = first;
        while (curr != null){
            System.out.println(curr.ele);
            curr =curr.next;
        }
    }
    public void revDisplay(){
        Node curr = last;
        while ((curr != null)) {
            System.out.println(curr.ele);
            curr = curr.prev;
            
        }
    }
}


public class DoubleLinkeList {
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
*/
