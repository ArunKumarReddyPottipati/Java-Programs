import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        /*
         * push
         * 
         * search
         */
        Stack<Integer> s1 = new Stack<Integer>();
        System.out.println(s1);
        s1.push(10);
        s1.push(29);
        s1.push(38);
        s1.push(34);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.search(25));
        System.out.println(s1.search(29));
        System.out.println(s1);
        System.out.println(s1.isEmpty());

    }
}
