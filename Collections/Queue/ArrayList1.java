import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 22, 3, 4 };
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        a2.add(99);
        a2.add(77);
        a2.add(88);
        a1.add(10);
        a1.add(3);
        a1.add(4);
        a1.add(null);
        a1.add(89);
        a1.add(null);
        a1.addAll(a2);
        a1.addAll(0, a2);
        a1.remove(0);
        System.out.println(a1);
        a1.removeAll(a2);
        a1.set(2, 13);
        System.out.println(a1);
        System.out.println(a1.indexOf(null));
        System.out.println(a1.size());
        System.out.println(a1.contains(5));
        System.out.println(a1.isEmpty());
        a1.remove(null);
        a1.remove(null);
        Collections.sort(a1, Collections.reverseOrder());
        System.out.println(a1.clone());
        System.out.println(a1);
        Collections.synchronizedList(a1);
    }
}
