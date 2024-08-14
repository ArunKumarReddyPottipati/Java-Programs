
import java.util.LinkedHashSet;

public class LinkedHSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(3);
        lhs.add(345);
        lhs.add(56);
        lhs.add(1);
        System.out.println("Original Set:" + lhs);
        lhs.add(345);
        lhs.add(56);
        lhs.add(1);
        System.out.println("After adding Duplicates:" + lhs);
        lhs.remove(56);
        System.out.println(lhs);
        System.out.println(lhs.contains(345));
        System.out.println(lhs.isEmpty());
        System.out.println("Size of the set :" + lhs.size());
        String s = lhs.toString();
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.substring(1, 5));

    }
}
