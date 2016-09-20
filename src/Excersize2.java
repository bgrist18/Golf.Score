import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by brett on 9/20/16.
 */
public class Exercise02 {
    public static void main(String[] args) {
        Email[] emails = {
                new Email("alice@gmail.com", "HELLO", "yo", false),
                new Email("bob@gmail.com", "HELLO", "yo", false),
                new Email("charlie@gmail.com", "HELLO", "yo", false),
                new Email("alice@gmail.com", "HELLO", "yo", false),
                new Email("bob@gmail.com", "HELLO", "yo", false)
        };

        // hash map that looks like this:
        // "alice@gmail.com" -> arraylist of two emails
        // "bob@gmail.com" -> arraylist of two emails
        // "charlie@gmail.com" -> arraylist of one email

        HashMap<String, ArrayList<Email>> emailMap = new HashMap<>();

        for (Email e : emails) {
            ArrayList<Email> arr = emailMap.get(e.destination);
            if (arr == null) {
                arr = new ArrayList<>();
                emailMap.put(e.destination, arr);
            }
            arr.add(e);
        }

        // ALTERNATIVE SOLUTION

        emailMap.clear();

        for (Email e : emails) {
            if (!emailMap.containsKey(e.destination)) {
                emailMap.put(e.destination, new ArrayList<>());
            }
            emailMap.get(e.destination).add(e);
        }
    }
}