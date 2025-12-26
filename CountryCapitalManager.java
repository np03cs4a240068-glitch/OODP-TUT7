import java.util.HashMap;
import java.util.Map;

public class CountryCapitalManager {

    private static HashMap<String, String> countryCapitals = new HashMap<>();

    public static void main(String[] args) {

        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Brazil", "Brasília");

        System.out.println("All country-capital pairs:");
        printMap(countryCapitals);

        System.out.println("\nCapital of France: " + getCapital("France"));

        System.out.println("\nIs 'Tokyo' a capital in the map? " + containsCapital("Tokyo"));
        System.out.println("Is 'Beijing' a capital in the map? " + containsCapital("Beijing"));

        System.out.println("\nIterating through country-capital map:");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }

    public static void printMap(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static String getCapital(String country) {
        return countryCapitals.getOrDefault(country, "Capital not found");
    }

    public static boolean containsCapital(String capital) {
        return countryCapitals.containsValue(capital);
    }
}
