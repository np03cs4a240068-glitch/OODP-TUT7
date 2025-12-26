import java.util.ArrayList;
import java.util.Collections;

public class BN {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(7);
        numbers.add(23);
        numbers.add(87);
        numbers.add(12);
        numbers.add(55);
        numbers.add(41);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        int target = 23;

        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Element " + target + " not found in the list.");
        } else {
            System.out.println("Element " + target + " found at index: " + result);
        }
    }
    public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found
    }
}
