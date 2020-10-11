package ge.edu.btu.stringexercises;

public class Exercise5 {

    public static void main(String[] args) {
        String str = "dgasg asfg asfg asfgas fgasfgasfgas gasgsag safg";

        String[] words = str.split(" ");
        String ans = "";
        for (String word : words) {
            if (word.length() > ans.length()) {
                ans = word;
            }
        }
        System.out.println("სტრიქონში ყველა გრძელი სიტყვაა " + ans);
    }
}
