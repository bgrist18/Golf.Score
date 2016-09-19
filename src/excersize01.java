/**
 * Created by brettgrist on 9/19/16.
 */
public class excersize01 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Alex", "Beth"};
        //"A" ["Alice", "Alex)
        //"B" ["Bob", "Beth")
        //"C" ["Charlie"]

        Hashmap<String, ArrayList<String>> nameMap = new HashMap<>();

        //"A" []
        //"B" []
        //"C" []
        //"D" []

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0);
            nameMap.put(firstLetter, new ArrayList<String>());
        }

        for (String name : names) {
            String firstLetter = String.valueOf(name.CharAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            arr.add(name);
        }

        //Alternative Solution:

        nameMap.clear();

        for (String name : names) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> arr = nameMap.get(firstLetter);
            if (arr == null) {
                arr = new ArrayList<>();
            }
            arr.add(name);
            nameMap.put(firstLetter, arr);
        }

        System.out.println(nameMap);

    }
}
