/*
Write a program to print the sum of the even numbers in a list
input: {4, 5, 0, 9, 8, 10}
output: 22

*/

import java.util.ArrayList;
import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list:");
        int n = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> a = new ArrayList<>(n);
        System.out.println("Enter the values of the list:");
        for (int i = 0; i < n; i++)
            a.add(sc.nextInt());
        for (int i = 0; i < a.size(); i++)
            if (a.get(i) % 2 == 0)
                sum += a.get(i);
        System.out.println("Sum of the even numbers in the list is:" + sum);

    }
}


/*
Output:

Enter the size of the list:7
Enter the values of the list:
2
4
6
5
7
8
2
Sum of the even numbers in the list is:22
*/
