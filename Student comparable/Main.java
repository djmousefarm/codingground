import java.util.*;
public class Main {
    
    public static void main (String[] args) {
    List<Student> students = new ArrayList<Student>();
    students.add(new Student("mikael"));
    students.add(new Student("matti"));
    students.add(new Student("Zoe"));
    students.add(new Student("Bob"));
    students.add(new Student("Michelle"));
    students.add(new Student("talia"));
    students.add(new Student("SNAKE"));    

    list(students);
    Collections.sort(students);
    list(students);
    }

    public static void list (List<Student> students) {
        int count = 0;
        System.out.print("[");
        for (Student student : students) {
            count++;
            if (count != students.size()) {
                System.out.print(student.getName() + ", ");
            } else {
                System.out.println(student.getName() + "]");                
            }
        }
    }
    
}    