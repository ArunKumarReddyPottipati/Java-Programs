/*
Write a Program to split a list into two lists
input: {4, 9, 8, 5, 0,10}
output: list1 - {4, 9, 8} & list2-{5, 0,10}
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SplitList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        System.out.print("Enter the size of the List:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
            a.add(sc.nextInt());
        for (int i = 0; i < a.size() / 2; i++)
            a1.add(a.get(i));
        for (int i = a.size() / 2; i < n; i++)
            a2.add(a.get(i));
        System.out.print("Original List :" + a);
        System.out.println("\nAfter Splitting:");
        System.out.print("List1: " + a1);
        System.out.println("\nList2: " + a2);

    }
}

/*
Output:

Enter the size of the List:8
Enter the elements of the array:
12
34
54
6
78
63
48
9
Original List :[12, 34, 54, 6, 78, 63, 48, 9]
After Splitting:
List1: [12, 34, 54, 6]
List2: [78, 63, 48, 9]

*/
