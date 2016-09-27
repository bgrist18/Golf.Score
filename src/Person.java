import java.util.Comparator;

/**
 * Created by brett on 9/12/16.
 */
public class Person implements Comparable{
    String name;
    int age;
    boolean isAlive;
    double balance;
    static int minimumAge = 18;

    Person() {

    }

    Person(String newName, int newAge, boolean newIsAlive){
        setName(newName);
        setAge(newAge);
        setIsAlive(newIsAlive);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", balance=" + balance +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.name.compareTo(p.name);
    }
}