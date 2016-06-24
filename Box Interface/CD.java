// CD's parameter contains its artist (String), title (String), 
// and publishing year (int). All CDs weigh 0.1 kg.

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int year;
    private double weight;
    
    public CD (String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }
    
    public double weight() {
        return this.weight;        
    }
    
    public String toString() {
        // Example : Rendezvous Park: Closer to Being Here (2012)
        return this.artist + ": " + this.title + " (" + this.year + ")";
        
    }
}