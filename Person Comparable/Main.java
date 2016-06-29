import java.util.*;
public class Main{

    public static void main(String []args){
        List<Person> person = new ArrayList<Person>();
        person.add(new Person("mikael", 182.0));
        person.add(new Person("matti", 187.5));
        person.add(new Person("joel", 182.5));
        person.add(new Person("smap", 187.0));
        person.add(new Person("bippy", 183.0));        

        System.out.println(person);
        Collections.sort(person);
        System.out.println(person);
    }
}
