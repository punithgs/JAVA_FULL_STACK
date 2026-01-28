import java.lang.reflect.InaccessibleObjectException;
import java.util.function.ObjDoubleConsumer;
import java.util.stream.Stream;

class MyArrayList {
    private Object[] arr;
    private int p = 0;

    public MyArrayList() {
        arr = new Object[10];
    }

    public void add(Object e) {
        if (p >= arr.length) {
            increaseArraySize();
        }
        arr[p++] = e;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (p >= arr.length) {
            increaseArraySize();
        }
        for (int i = p - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = e;
        p++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int size() {
        return p;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < size(); i++) {
            arr[i - 1] = arr[i];
        }
        arr[--p] = null;
    }

    public void clear() {
        for (int i = 0; i < p; i++) {
            arr[i] = null;
        }
        p = 0;
    }

    private void increaseArraySize() {
        Object[] temp = new Object[arr.length + 3];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
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

public class ArrayList_implementation {
    public static void main(String[] args) {
        MyArrayList a = new MyArrayList();

        System.out.println(a);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);
        a.add(1, 15);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}

/*class MyArrayList {
    private Object [] arr;
    private int p =0 ;

    public MyArrayList()
    {
        arr = new Object[10];
    }
    public void add (Object e){
        if(p >= arr.length){
            Object[] temp = new Object[arr.length+3];
            for (int i = 0 ; i < arr.length; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[p++] = e;
    }
    public int size(){
        return p;
    }
    public Object get (int index){
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

public void add (int index , Object e){
    if(index <= -1 || index >= size()){
        throw new IndexOutOfBoundsException();
    }
    if(p >= arr.length)
        increaseArraySize();
    for (int i = size() - 1; i >= index; i-- ){
        arr[i+1] = arr[i];
    }
    arr[index] = e;
    p++;
}
private void increaseArraySize(){
    Object temp = new Object[arr.length + 3];
}
public void remove (int index){
    if(index < 0 || index > size()){
        throw new IndexOutOfBoundsException();
    }
    for (int i = index + 1; i < size(); i++){
        arr[i - 1] = arr[i];
    }
    p--;
    arr[p] = null;
}
@Override
public String toString(){
    if (size() == 0)
        return "[]";
    String s = "[" + arr[0];
    for (int i = 1; i < size(); i++){
        s = s+ "," + arr[i];
    }
    s += "]";
    return s;
}
}

public class ArrayList_implementation {
    public static void main(String[] args) {
        ArrayList_implementation a = new ArrayList_implementation();

        System.out.println(a);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a);
        a.add(1,15);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
*/

