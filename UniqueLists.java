import java.util.TreeSet;

public class UniqueLists {

    public static void main(String[] args) {
        // Create a TreeSet to store unique names in alphabetical order
        TreeSet<String> names = new TreeSet<>();

        // Add names to the TreeSet
        names.add("Ronit");
        names.add("Subash");
        names.add("Jaya");
        names.add("Sanakrit");
        names.add("Aayush");  
        names.add("Tezus");

        System.out.println("Unique names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
