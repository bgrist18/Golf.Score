import java.nio.file.attribute.FileTime;
import java.util.ArrayList;

/**
 * Created by brettgrist on 9/26/16.
 */
public class Excersize4 {
    public static void main (String[] args) {
        String [] names = {"charlie", "david", "chuck", "bob", "alice", "andrew"};
        ArrayList<String> sortedNames = new ArrayList<>();
        //sortedNames must contain the names sorted alphabetically
        for (String name : names){
            int index = 0;
            //
            for(String sortedName : sortedNames){
                if (name.compareTo(sortedName) > 0) {
                    index++;
                }
                else
                    break;
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}
