import java.util.ArrayList;
import java.util.Collections;

public class RotateArrayList {
    public static void rotateRight(ArrayList<Integer> list, int positions) {
        int size = list.size();
        if (size == 0) return;

        positions = positions % size;

        Collections.reverse(list);

        Collections.reverse(list.subList(0, positions));

        Collections.reverse(list.subList(positions, size));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        int rotateBy = 2;
        rotateRight(list, rotateBy);

        System.out.println("Rotated list: " + list);  
    }
}
