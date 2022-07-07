/*Print the triangle as shown below--
Example- 
*****
****
***
**
*/


//Approach 1

import java.util.*;

class PrintTriangle {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter the Limit ");

        int limit = scanner.nextInt();
        for (int i = 0; i < limit; i++) {
            for (int j = limit; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Approach 2 TC=O(N^2)

import java.util.*;

class PrintTriangle {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter the Count ");

        int count = scanner.nextInt();
        while (count > 0) {
            for (int i = count; i > 0; i--) {
                System.out.print("*");
            }
            count--;
            System.out.println();
        }
    }
}

//Approach 3

import java.util.*;

class PrintTriangle {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter the Count ");

        int count = scanner.nextInt();
        String asterisk = "";
        for (int i = 1; i <= count; i++) {
            asterisk += '*';
        }
        for (int j = count; j > 0; j--) {
            System.out.println(asterisk.substring(0, j));
        }
        System.out.println();
    }
}
