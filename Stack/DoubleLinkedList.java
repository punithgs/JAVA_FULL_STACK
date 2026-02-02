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

