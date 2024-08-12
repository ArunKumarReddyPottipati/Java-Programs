
import java.util.*;

public class Vectors {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        Vector v1 = new Vector(Arrays.asList(arr));
        Vector<Integer> v2 = new Vector<>();
        Vector v3 = new Vector();
        v3.add(1);
        v3.add(0, 5);
        v3.add(10);
        v1.add("raja");
        v1.add("ravi");
        v1.add(0, "rakesh");
        v1.addAll(v3);
        v1.add(null);
        v1.add(null);
        System.out.println(v1);
        System.out.println(v1.get(1));
        v1.remove(1);
        System.out.println(v1);
        System.out.println(v1.contains("ravi"));
        System.out.println(v2);
        v1.set(0, "deva");
        System.out.println(v1);
        System.out.println(v1.isEmpty());
        System.out.println(v1.indexOf("ravi"));
        System.out.println(v1.lastElement());

    }
}
