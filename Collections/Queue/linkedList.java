import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        LinkedList<String> l2 = new LinkedList<>();
        l2.add("90");
        l2.add("78");
        l1.add("A1");
        l1.add("A8");
        l1.add("b5");
        l1.addAll(l2);
        l1.addFirst("kk");
        l1.addLast("ZZ");
        System.out.println(l1);
        l1.remove();
        l1.removeLast();
        l1.remove(4);
        System.out.println(l1);
        System.out.println(l1.contains("90"));
        System.out.println(l1.indexOf("A8"));
        l1.set(0, "Ky");
        System.out.println(l1);
        for(int i=0;i<l1.size();i++)
            System.out.print(l1.get(i)+" ");

    }
}
