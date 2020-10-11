package ge.edu.btu.stringexercises;

public class Exercise4 {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "AbcBCdaaacbcCABCAAbcBBDAAabca";

        int counter = 0;
        if (str2.length() > str1.length()) {
            for (int i = 0; i < str2.length() - str1.length(); i++) {
                if (str2.substring(i, i + str1.length()).equalsIgnoreCase(str1)) {
                    counter++;
                }
            }
        }

        System.out.println(String.format("პირველი სტრიქონი მეორეში გვხვდება %s-ჯერ", counter));
    }
}
