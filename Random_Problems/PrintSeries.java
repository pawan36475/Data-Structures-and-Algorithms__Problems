/*
Print the pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
 

/*Approach-1
Enter limit= 5 to get the pattern*/

import java.util.*;

public class PrintSeries {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the limit ");
        int limit = scanner.nextInt();

        int k = 0;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                k += 1;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

/*Approach-2 Tc=O(N)

Enter limit = 15 to get the pattern
 */


import java.util.*;

public class PrintSeries {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the limit ");
        int limit = scanner.nextInt();

        int current_line = 1;
        int element_printed = 0;
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
            element_printed++;
            if (current_line == element_printed) {
                System.out.println();
                element_printed = 0;
                current_line++;
            }
        }
    }
}
