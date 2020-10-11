package ge.edu.btu.stringexercises;

public class Exercise1 {

    public static void main(String[] args) {
        String str = "adg824t2n52kv5h2";

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                counter++;
            }
        }

        System.out.println(String.format("სტრიქონში არის %s ციფრი", counter));
    }
}
