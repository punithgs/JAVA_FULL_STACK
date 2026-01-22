class Node {
    Object ele;
    Node next;

    Node (Object ele)
    {
        this.ele= ele;
    }

    public Node (Object ele, Node next){
        this.ele=ele;
        this.next=next;

    }
    
}

public class Hashset {

    Node[] a = new Node[10];
    int count = 0;

    public int size(){
        return count;
    }
    public boolean add (Object ele){
        if (ele == null)
            ele += "";

        Node  n = new Node(ele);
        int index = Math.abs(ele.hashCode());//Hashing
        if(a[index] == null){
            a[index]=n;
            count++;
            return true;
        }

        Node curr = a[index];
        Node temp = null;

        while (curr != null) {
            if(curr.ele.equals(ele))
                return false;

            temp = curr;
            curr = curr.next;
            
        }
        temp.next = n;
        count++;
        return true;
    }
    public void display(){
        for(int i=0; i<a.length; i++)
        {
            Node curr = a[i];
            while (curr != null) 
                {
                    System.out.println(curr.ele);
                    curr = curr.next;
                
            }
        }
    }
}

/*public class Test {
    public static void main(String[] args) {
        
        Hashset n = new Hashset();
        n.add("ram");
        n.add("sita");
        n.add("ram");
        n.add("ram");
        n.add("sita");
        n.add("null");
        n.add(null);
        n.add("null");
        n.display();
    }

    
}*/