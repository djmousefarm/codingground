import java.util.ArrayList;

public class Book {
    private ArrayList<Bird> birds;
    
    public Book () {
        birds = new ArrayList<Bird>();
    }
    
    public void addBird (Bird newBird) {
        birds.add(newBird);
    }
    
}