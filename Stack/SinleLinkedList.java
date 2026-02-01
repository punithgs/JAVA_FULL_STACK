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

