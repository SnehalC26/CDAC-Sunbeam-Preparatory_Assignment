class DuplicateStrings {

    void findDuplicates(String[] arr) {

        System.out.println("Duplicate Strings:");

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {

                if (arr[i].equals(arr[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted)
                continue;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {

                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

public class Q13DuplicateStrings {

    public static void main(String[] args) {

        String[] arr = {
            "Java",
            "Python",
            "Java",
            "C++",
            "Python",
            "JavaScript"
        };

        DuplicateStrings ds = new DuplicateStrings();
        ds.findDuplicates(arr);
    }
}