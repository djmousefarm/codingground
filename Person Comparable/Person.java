import java.util.*;
public class Person implements Comparable<Person> {
    private String name;
    private Double salary;
    
    public Person (String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Double getSalary() {
        return this.salary;
    }
    
    @Override
    public String toString() {
        return this.name + " earns " + this.salary;
    }
    
    @Override
    public int compareTo(Person person) {
        if(this.salary == person.getSalary()) {
            return 0;
        } else if (this.salary > person.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}