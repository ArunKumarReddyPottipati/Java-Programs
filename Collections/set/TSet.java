import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(120);
        ts.add(45);
        ts.add(1);
        ts.add(98);
        ts.add(475);
        ts.add(29);
        System.out.println(ts);
        System.out.println("After adding duplicate elements:");
        ts.add(1);
        ts.add(98);
        ts.add(475);
        ts.add(29);
        System.out.println(ts);
        System.out.println("Size=" + ts.size());
        System.out.println(ts.isEmpty());
        ts.remove(98);
        System.out.println(ts.remove(34));
        System.out.println(ts);
        System.out.println(ts.contains(1));
        System.out.println("Printing in Descending order:");
        System.out.println(ts.descendingSet());
        System.out.println("Printing first element:" + ts.first());
        System.out.println("Printing Last element:" + ts.last());
        System.out.println(ts.subSet(20, 100));

    }
}
