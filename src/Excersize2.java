import java.util.ArrayList;

/**
 * Created by brettgrist on 9/20/16.
 */
public class Excersize2 {
    public static void main(String[]) args{
        Email[] emails = {
                new Email["alice@gmail.com", "hello,", "yo", false],
                new Email["bob@gmail.com", "hello,", "yo", false],
                new Email["charlie@gmail.com", "hello,", "yo", false],
                new Email["alice@gmail.com", "hello,", "yo", false],
                new Email["bob@gmail.com", "hello,", "yo", false]
        };

        //hash map that looks like ths:
        //"alice@gmail.com" -> arraylist of two emails
        //"bob@gmail.com" -> arraylist of two emails
        //charlie@gmail.com -> arraylist of one email
    }

    HashMap<ArrayList<Email>> emailMap=new HashMap<>>();

    for (Email e : emails) {
        ArrayList<Email> arr = emailMap.get(e.destination);
        if (arr ==null) {
            arr = new ArrayList<>();
            emailMap.put(e.destination, arr);
        }
        arr.add(e);
    }


}
