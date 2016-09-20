import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by brett on 9/16/16.
 */
public class HashMapStuff {
    static HashMap<String, Person> users = new HashMap<>();

    public static void main(String[] args) {
        users.put("Alice", new Person("Alice", 30, true));
        users.put("Bob", new Person("Bob", 40, true));

        Scanner scanner = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("Enter username:");
            String name = scanner.nextLine();

            if (!users.containsKey(name)) {
                Person p = new Person(name, 20, true);
                users.put(name, p);
            }

            Person user = users.get(name);

            System.out.println("Logged in as: " + user.name);
        }
    }
}