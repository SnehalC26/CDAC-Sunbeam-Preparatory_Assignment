package CDAC-Sunbeam-Preparatory_Assignment;

public class Q12ReverseString {
  
}
import java.util.Scanner;

class ReverseString {

    void reverse(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}

public class Q12ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        ReverseString rs = new ReverseString();
        rs.reverse(str);

        sc.close();
    }
}