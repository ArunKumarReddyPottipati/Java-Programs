import java.util.*;

public class Vectors3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in Vector:");
        int n = sc.nextInt();
        Vector<Integer> v1 = new Vector<>(n);
        System.out.println("Enter the elements of the vector");
        for (int i = 0; i < n; i++) {
            v1.add(sc.nextInt());
        }
        System.out.println("Elements of the vector is: ");
        System.out.println(v1);
        Collections.sort(v1);
        System.out.println("Elements after sorting:" + v1);
    }
}
