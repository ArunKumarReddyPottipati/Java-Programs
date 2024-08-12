import java.util.Deque;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        Deque<Integer> l1 = new LinkedList<>();
        l1.add(12);
        l1.add(27);
        l1.add(4);
        l1.add(78);
        l1.add(99);
        l1.offer(29);
        l1.offer(74);
        l1.add(67);
        l1.offer(56);
        System.out.println(l1);
        System.out.println("Adding from begining:");
        l1.addFirst(35);
        System.out.println(l1);
        System.out.println("Adding from end:");
        l1.addLast(39);
        System.out.println(l1);
        System.out.println("Removing an element:" + l1.remove());
        System.out.println(l1);
        System.out.println("removing first elementL:" + l1.removeFirst());
        System.out.println(l1);
        System.out.println("removing last element:" + l1.removeLast());
        System.out.println(l1);
        System.out.println("size of the linkedlist: " + l1.size());
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains(20));
        System.out.println("Clearing the entire list:");
        l1.clear();
        System.out.println(l1);
    }
}