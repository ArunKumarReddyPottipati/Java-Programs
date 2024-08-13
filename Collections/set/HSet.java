import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(3);
        hs.add(345);
        hs.add(56);
        hs.add(1);
        System.out.println("Original Set:" + hs);
        hs.add(345);
        hs.add(56);
        hs.add(1);
        System.out.println("After adding Duplicates:" + hs);
        hs.remove(56);
        System.out.println(hs);
        System.out.println(hs.contains(345));
        System.out.println(hs.isEmpty());
        System.out.println("Size of the set :" + hs.size());
    }
}