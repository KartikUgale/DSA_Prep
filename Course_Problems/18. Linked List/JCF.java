import java.util.LinkedList;

public class JCF { // JAVA COLLECTION FRAMEWORK
    public static void main(String[] args) { // main method
        LinkedList<Integer> ll = new LinkedList<>(); // creating a linked list
        ll.add(1); // adding elements to the linked list
        ll.add(2);
        ll.addFirst(0); // adding element at the first position
        System.out.println(ll);
        ll.removeFirst(); // removing the first element
        ll.remove(); // removing the last element
        System.out.println(ll);
    }

}