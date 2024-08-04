/*
Write a Program to delete the duplicates from a list
input1: {4, 1, 9, 4, 8, 0, 5, 1, 8, 6} output: {9,0, 5, 6}
*/

import java.util.ArrayList;
import java.util.Scanner;

public class DelDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        System.out.print("Enter the number of elements in the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++)
            l1.add(sc.nextInt());
        for (int ele : l1)
            if (l2.contains(ele))
                continue;
            else
                l2.add(ele);
        for (int i = 0; i < l2.size(); i++)
            l1.remove(l2.get(i));
        for (int i = 0; i < l1.size(); i++)
            l2.remove(l1.get(i));
        System.out.println("List after deleting duplicate elements from the list: ");
        System.out.println(l2);

    }
}

/*
Output:

Enter the number of elements in the list: 10
Enter the elements of the list:
4
1
9
4
8
0
5
1
8
6
List after deleting duplicate elements from the list: [9, 0, 5, 6]
[9, 0, 5, 6]

*/
