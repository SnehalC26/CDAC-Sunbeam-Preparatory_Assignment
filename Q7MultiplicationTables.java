import java.util.Scanner;

class MultiplicationTables {

    void displayTables(int start, int end) {

        for (int i = start; i <= end; i++) {

            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}

public class Q7MultiplicationTables {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        MultiplicationTables mt = new MultiplicationTables();
        mt.displayTables(start, end);

        sc.close();
    }
}