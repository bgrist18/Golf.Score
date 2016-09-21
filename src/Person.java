/**
 * Created by brett on 9/12/16.
 */
public class Person {
    String name;
    int age;
    boolean isAlive;
    static int minimumAge = 18;

    Person(String newName, int newAge, boolean newIsAlive) {
        setName(newName);
        setAge(newAge);
        setIsAlive(newIsAlive);
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        if (isValidName(newName)) {
            name = newName;
        }
    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        if (newAge >= minimumAge) {
            age = newAge;
        }
    }

    boolean getIsAlive() {
        return isAlive;
    }

    void setIsAlive(boolean newIsAlive) {
        if (age > 100) {
            isAlive = false;
        }
        else {
            isAlive = newIsAlive;
        }
    }

    static boolean isValidName(String name) {
        return name.contains(" ");
    }
}