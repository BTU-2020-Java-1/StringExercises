package ge.edu.btu.stringexercises;

public class Exercise6 {

    public static void main(String[] args) {
        String str = "ab a a bc aa bc aa a";

        String[] words = str.split(" ");

        String ans = "";
        int ansCount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            int counter = 0;
            for (String s : words) {
                if (word.equals(s)) {
                    counter++;
                }
            }
            if (counter > ansCount) {
                ans = word;
                ansCount = counter;
            }
        }

        System.out.println(String.format("ყველაზე ხშირად მეორდება სიტყვა %s(%s-ჯერ)", ans, ansCount));
    }
}
