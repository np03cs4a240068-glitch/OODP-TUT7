import java.util.HashSet;
import java.util.Set;

public class AnimalSetOperations {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("jarayo");
        set1.add("biralo");
        set1.add("gadha");
        set1.add("bhalu");

        Set<String> set2 = new HashSet<>();
        set2.add("baag");
        set2.add("syal");
        set2.add("bhaisi");
        set2.add("sungur");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        Set<String> union = performUnion(set1, set2);
        System.out.println("Union: " + union);

        Set<String> intersection = performIntersection(set1, set2);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = performDifference(set1, set2);
        System.out.println("Difference (Set1 - Set2): " + difference);
    }

    public static Set<String> performUnion(Set<String> s1, Set<String> s2) {
        Set<String> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
    public static Set<String> performIntersection(Set<String> s1, Set<String> s2) {
        Set<String> result = new HashSet<>(s1);
        result.retainAll(s2);
        return result;
    }
    public static Set<String> performDifference(Set<String> s1, Set<String> s2) {
        Set<String> result = new HashSet<>(s1);
        result.removeAll(s2);
        return result;
    }
}
