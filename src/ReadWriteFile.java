import com.sun.tools.internal.ws.wscompile.FilerCodeWriter;

import java.io.*;
import java.util.Scanner;

/**
 * Created by brettgrist on 9/21/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("Alice\n");
            fw.write("Bob\n");
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                String name = scanner.nextLine();
                System.out.println(name);
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(f);
            int fileSize = (int) f.length();
            char[] contents = new char[fileSize];
            fr.read(contents, 0, fileSize);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
