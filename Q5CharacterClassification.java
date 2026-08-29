import java.util.Scanner;

class CharacterClassification {

    void classify(String str) {

        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                uppercase++;
            else if (Character.isLowerCase(ch))
                lowercase++;
            else if (Character.isDigit(ch))
                digits++;
            else
                others++;
        }

        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
        System.out.println("Digits: " + digits);
        System.out.println("Other characters: " + others);
    }
}

public class Q5CharacterClassification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        CharacterClassification cc = new CharacterClassification();
        cc.classify(str);

        sc.close();
    }
}