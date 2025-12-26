import java.util.HashMap;
import java.util.Scanner;

public class ContactList {

    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Book");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    contacts.put(name, phone);
                    System.out.println("Contact added!");
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    if (contacts.containsKey(searchName)) {
                        System.out.println("Phone number: " + contacts.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.println("\nAll Contacts:");
                    for (String key : contacts.keySet()) {
                        System.out.println(key + ": " + contacts.get(key));
                    }
                    break;
                case 4:
                    System.out.println("Exiting Contact Book...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
