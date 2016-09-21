import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by brettgrist on 9/21/16.
 */
public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        Person p = new Person("Alice Smith", 30, true);
        File f = new File("person.json");

        //write json
        jodd.json.JsonSerializer serializer = new jodd.json.JsonSerializer();
        String json = serializer.serialize(p);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        //read json
        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();
        char[] contents = new char[fileSize];
        fr.read(contents, 0, fileSize);
        jodd.json.JsonParser parser = new jodd.json.JsonParser();
        Person p2 = parser.parse(contents, Person.class);
        System.out.println(p2);
            }
        }
