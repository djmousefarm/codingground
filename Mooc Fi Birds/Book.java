import java.util.ArrayList;

public class Book {
    private ArrayList<Bird> alBirds;
    
    public Book () {
        alBirds = new ArrayList<Bird>();
    }
    
    public void addBird (Bird newBird) {
        alBirds.add(newBird);
    }
    
}