/*
Write a Program to print the repeated/duplicate elements along with its repetition count
input: {baby, ball, soap, baby, shampoo, chalk, soap, makeup, baby, lotion}
output: baby - 3 & soap - 2

*/

import java.util.ArrayList;
import java.util.Scanner;

public class DupCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList l2 = new ArrayList();
        System.out.print("Enter the size of the list:");
        int n = sc.nextInt();
        System.out.println("Enter the values of the list:");
        sc.nextLine();
        for (int i = 0; i < n; i++)
            l1.add(sc.nextLine());
        for (int i = 0; i < n - 1; i++) {
            int c = 1;
            if (l2.contains(l1.get(i)))
                break;
            else {
                for (int j = i + 1; j < n; j++)
                    if (l1.get(i).equals(l1.get(j)))
                        c++;
                if (c > 1) {
                    l2.add(l1.get(i));
                    l2.add(c);
                }
            }
        }
        System.out.println("Duplicate Elements and their counts are:");
        for(int i=0;i<l2.size();i+=2)
            System.out.println(l2.get(i)+": "+l2.get(i+1));

    }
}

/*
Output:1

Enter the size of the list:6
Enter the values of the list:
apple
banana
apple
guava
mango
banana
Duplicate Elements and their counts are:
apple: 2
banana: 2

Output:2

Enter the size of the list:10
Enter the values of the list:
baby
ball
soap
baby
shampoo
chalk
soap
makeup
baby
lotion
Duplicate Elements and their counts are:
baby: 3
soap: 2

*/
