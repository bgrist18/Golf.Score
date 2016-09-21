import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static com.intellij.ui.content.ContentManagerEvent.ContentOperation.remove;

/**
 * Created by brettgrist on 9/21/16.
 */
public class Excersize3 {
    public static void main(String[] args) {
        String [] names = {"alice", "bob", "charlie", "daniel", "andrew", "alex"};
        ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));

        //build array that doesn't start with a

        for (String name : names) {
            if (name.charAt(0) == 'a'){
                namesArr.remove(name);
            }
        }
        
        //iterator
        namesArr = new ArrayList<>(Arrays.asList(names));
        Iterator<String> iter = namesArr.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.charAt(0) == 'a'){
                iter.remove();
            }
        }
    }
}
