/*
 Write a Program to print the sum & average of the elements present in list
input: 
6
{4, 5, 0, 9, 8, 10}
output: 
sum - 36
average - 6

*/

import java.util.ArrayList;
import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of the list:");
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);
            int sum = 0;
            float avg = 0;
            System.out.println("Enter the elements of the list:");
            for (int i = 0; i < n; i++)
                a.add(sc.nextInt());
            for (int i = 0; i < n; i++)
                sum += a.get(i);
            avg = (float) sum / n;
            System.out.print("Sum of the elements in the list is :" + sum);
            System.out.println("\nAverage of the elements in the list is:" + avg);

        }
    }
}


/*
Output:1
Enter the length of the list:6
Enter the elements of the list:
4
5
0
9
8
10
Sum of the elements in the list is :36
Average of the elements in the list is:6.0

Output2:
Enter the elements of the list:
1
2
Sum of the elements in the list is :3
Average of the elements in the list is:1.5
*/
