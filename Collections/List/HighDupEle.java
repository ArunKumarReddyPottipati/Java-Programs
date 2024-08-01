/*

Write a program to identify the highest number of duplicates element in a list
input1: {4, 1, 9, 4, 8, 0, 5, 8, 1, 8, 6} 
output: 8

*/

import java.util.ArrayList;
import java.util.Scanner;

public class HighDupEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        System.out.print("Enter the number of elements in the list:");
        int n = sc.nextInt();
        int high = 0, highele = 0;
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++)
            l1.add(sc.nextInt());
        for (int i = 0; i < n - 1; i++) {
            int c = 1;
            if (l2.contains(l1.get(i)))
                continue;
            else {
                for (int j = i + 1; j < n; j++)
                    if (l1.get(i).equals(l1.get(j)))
                        c++;
                if (c > 1) {
                    l2.add(l1.get(i));
                    if (c > high) {
                        high = c;
                        highele = i;
                    }
                }
            }
        }
        System.out.println("The highest repeated element is: " + l1.get(highele));
    }
}



/*
Output:
Enter the number of elements in the list:11
Enter the elements of the list:
4
1
9
4
8
0
5
8
1
8
6
The highest repeated element is: 8

*/
