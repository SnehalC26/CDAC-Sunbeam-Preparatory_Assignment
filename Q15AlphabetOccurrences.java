import java.util.Scanner;

class AlphabetOccurrences {

    void countAlphabets(String str) {

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {

            if (count[i] > 0) {

                char alphabet = (char) ('A' + i);

                System.out.println(alphabet + " : " + count[i]);
            }
        }
    }
}

public class Q15AlphabetOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        AlphabetOccurrences ao = new AlphabetOccurrences();
        ao.countAlphabets(str);

        sc.close();
    }
}