import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedListColor {
    public static void main(String[] args) {

        // 1. Declare a LinkedList to store strings (colors)
        LinkedList<String> colors = new LinkedList<>();

        // 2. Add five colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }

        if (colors.contains("Red")) {
            System.out.println("\nRed exists in the LinkedList.");
        } else {
            System.out.println("\nRed does NOT exist in the LinkedList.");
        }
        Collections.shuffle(colors);
        System.out.println("\nShuffled LinkedList:");
        for (String color : colors) {
            System.out.println(color);
        }
        Collections.sort(colors);
        System.out.println("\nSorted LinkedList in ascending order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
