// Book receives its writer (String), name (String), and weight (double), 
// all as parameter.

public class Book {
    private String writer;
    private String name;
    private double weight;
    
    public Book (String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        // Example: Kent Beck: Test Driven Development
        return this.writer + ": " + this.name;
    }
}