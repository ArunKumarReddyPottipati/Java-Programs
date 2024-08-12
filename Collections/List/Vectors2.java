import java.util.*;

public class Vectors2 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(4);
        v1.add(10);
        v1.add(12);
        v1.add(4);
        v1.add(10);
        v1.add(12);
        System.out.println(v1);
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }
        for (int i : v1) {
            System.out.print(i+" ");  
        }
    }
}