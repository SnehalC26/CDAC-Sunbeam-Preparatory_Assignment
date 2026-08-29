import java.util.Scanner;

class MaximumNumber {
    int findMaximum(int[] arr) {
      int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

public class Q1Maximum {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        MaximumNumber obj = new MaximumNumber();

        System.out.println("Maximum Number: " + obj.findMaximum(numbers));
    }
}