import java.util.ArrayList;
import java.util.Collections;

public class Colorssorter {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        Collections.sort(colors);
        System.out.println("Colors sorted in ascending order:");
        System.out.println(colors);

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Colors sorted in descending order:");
        System.out.println(colors);
    }
}
