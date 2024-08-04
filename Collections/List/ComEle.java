/*
Write a Program to create a list of common elements between two lists
input1: {4, 9, 8, 5} input2: {1,8,0, 5, 1, 6} output: {8, 5}
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ComEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        System.out.print("Enter the size of the list 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the list 1: ");
        for (int i = 0; i < n1; i++)
            l1.add(sc.nextInt());
        System.out.print("Enter the size of the list 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the list 2: ");
        for (int i = 0; i < n2; i++)
            l2.add(sc.nextInt());
        for (int i = 0; i < n1; i++)
            if (l2.contains(l1.get(i)))
                l3.add(l1.get(i));
        System.out.print("List1: " + l1);
        System.out.print("\nList2: " + l2);
        l2.clear();
        for (int i = 0; i < l3.size(); i++)
            if (l2.contains(l3.get(i)))
                continue;
            else
                l2.add(l3.get(i));
        System.out.println("\nCommon elements from List1 and List2 are: " + l2);

    }
}


/*
Output:

Enter the size of the list 1: 7
Enter the elements of the list 1: 
2
4
3
5
4
6
7
Enter the size of the list 2: 5
Enter the elements of the list 2:
1
4
8
9
3
List1: [2, 4, 3, 5, 4, 6, 7]
List2: [1, 4, 8, 9, 3]
Common elements from List1 and List2 are: [4, 3]
*/
