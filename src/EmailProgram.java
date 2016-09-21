import com.intellij.vcs.log.Hash;

import java.util.HashMap;

/**
 * Created by brettgrist on 9/20/16.
 */
public class EmailProgram {
    public static void main (String[] args) {
        HashMap<String, User> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();

            User user = users.get(name);
            if (user == null)
                user = new User();
            user.put(name, user);
        }
        System.out.println("[1] "New email");

                if (option.equals("[1]")){
            System.out.println("type email destination");
            String dest = scanner.nextLine();
            System.out.println("Type email body");
            String body = scanner.nextLine();
            Email e = new Email(dest, "", body, false);
            users.email.add(e);
        }
        else if (option.equals("2")){
            for (Email e : user.emails){
                System.out.println(e.destination + " " + e.body);
            }
        }
        else {
            System.out.println("Invalid option");
        }
    }
}
