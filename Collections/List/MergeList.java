/*
 Write a program to merge two lists into a single list
input1: {4, 9, 8}
input2: {5, 0,10}
output: {4, 9, 8, 5, 0,10}
*/

import java.util.ArrayList;
import java.util.Scanner;

public class MergeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        System.out.print("Enter the number of elements in List1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of the List1: ");
        for (int i = 0; i < n1; i++)
            l1.add(sc.nextInt());
        System.out.print("Enter the number of elements in List2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of the List2: ");
        for (int i = 0; i < n2; i++)
            l2.add(sc.nextInt());
        System.out.print("List1: " + l1);
        System.out.print("\nList2: " + l2);
        for (int i = 0; i < n2; i++)
            l1.add(l2.get(i));
        System.out.println("\nMerged List: " + l1);
    }

}


/*
Output:

Enter the number of elements in List1: 4
Enter the elements of the List1: 
2
4
6
5
Enter the number of elements in List2: 6
Enter the elements of the List2:
8
7
65
4
34
7
List1: [2, 4, 6, 5]
List2: [8, 7, 65, 4, 34, 7]
Merged List: [2, 4, 6, 5, 8, 7, 65, 4, 34, 7]

*/
