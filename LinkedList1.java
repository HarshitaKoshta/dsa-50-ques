
import java.util.LinkedList;

class LinkedList1{
    public static void main(String[] args) {
        LinkedList<Integer> a= new LinkedList<>();
        long start = System.nanoTime();
        a.add(4);
        System.out.println(a.get(0));
        System.out.println(a.contains(5));
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}