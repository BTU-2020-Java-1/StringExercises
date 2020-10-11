package ge.edu.btu.stringexercises;

public class Exercise3 {

    public static void main(String[] args) {
        String str = "abccba";

        boolean palindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("სტრიქონი პალინდრომია");
        } else {
            System.out.println("სტრიქონი არ არის პალინდრომი");
        }
    }
}
