import java.util.Scanner;

class Fibonacci {

    void generateFibonacci(int n) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

public class Q3Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        Fibonacci f = new Fibonacci();
        f.generateFibonacci(n);

        sc.close();
    }
}