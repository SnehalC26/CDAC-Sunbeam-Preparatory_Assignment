import java.util.Scanner;

class NumberConversion {

    void convert(int number) {

        System.out.println("Given Number: " + number);
        System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
        System.out.println("Octal equivalent: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number).toUpperCase());
    }
}

public class Q9NumberConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        NumberConversion nc = new NumberConversion();
        nc.convert(number);

        sc.close();
    }
}