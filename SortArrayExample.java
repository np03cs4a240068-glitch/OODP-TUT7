import java.util.Arrays;
import java.util.Collections;

public class SortArrayExample {
    public static void main(String[] args) {

        Integer[] numbers = {42, 7, 19, 3, 88, 25};

        Arrays.sort(numbers);
        System.out.println("Sorted in ascending order:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in descending order:");
        System.out.println(Arrays.toString(numbers));
    }
}
