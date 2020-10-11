package ge.edu.btu.stringexercises;

public class Exercise2 {

    public static void main(String[] args) {
        String str = "adfadd; ADfaf! adfad.";

        int counter = 0;
        for (char c : str.toCharArray()) {
            if (c == '.' || c == ';' || c == '?' || c == '!') {
                counter++;
            }
        }

        System.out.println(String.format("სტრიქონში არის %s წინადადება", counter));
    }
}
