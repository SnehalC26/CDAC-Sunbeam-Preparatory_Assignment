class Factorial {

    int calculateFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}

public class Q2Factorial {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            Factorial obj = new Factorial();
            System.out.println("Factorial: " + obj.calculateFactorial(n));
        }
    }
}