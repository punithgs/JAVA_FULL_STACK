class Node
{
    Object ele;
    Node next;

    Node(Object ele)
    {
        this.ele=ele;
    }
}

class Hashset
{
    Node[] a = new Node[10];
    int count = 0;

    public int size()
    {
        return count;
    }

    public boolean add(Object ele)
    {
        if(ele == null)
            ele += " ";

        Node n = new Node(ele);
        int index = Math.abs(ele.hashCode() % a.length);
        if(a[index] == null)
        {
            a[index] = n;
            count++;
            return true;
        }

        Node curr = a[index];
        Node temp = null;
        while (curr != null) 
        {
            if(curr.ele.equals(ele))
                return false;
            temp = curr;
            curr = curr.next;
        }
        temp.next = n;
        count++;
        return true;
    }

    public void display()
    {
        for(int i = 0; i < a.length; i++)
        {
            Node curr = a[i];
            while (curr != null) 
            {
                System.out.println(curr.ele);
                curr = curr.next; 
            }
        }
    }

    public boolean contains(Object ele)
    {
        int index = Math.abs(ele.hashCode() % a.length);
        Node curr = a[index];
        while (curr != null) 
        {
            if(curr.ele.equals(ele))
                return true;
            curr = curr.next;
        }
        return false;
    }

    public boolean remove (Object ele)
    {
        int index = Math.abs(ele.hashCode() % a.length);
        Node curr = a[index];
        Node prev = null;
        while (curr != null)
            {
                if(curr.ele.equals(ele))
                {
                    if(prev == null)
                    {
                        a[index] = a[index].next;
                        count--;
                        return true;
                    }
                    prev.next = prev.next.next;
                    count--;
                    return true;
                }
                prev = curr;
                curr = curr.next;
            } 
            return false;
    }
}

public class HashsetT {
    public static void main(String[] args) {

        Hashset hs = new Hashset();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add("Java");
        hs.add("Python");

        System.out.println("Contains 10: " + hs.contains(10));       // true
        System.out.println("Contains 40: " + hs.contains(40));       // false
        System.out.println("Contains Java: " + hs.contains("Java")); // true

        hs.remove(20);
        System.out.println("Contains 20 after removal: " + hs.contains(20)); // false

        System.out.println("\nAll elements in HashSet:");
        hs.display();

        System.out.println("\nSize: " + hs.size());
    }
}
