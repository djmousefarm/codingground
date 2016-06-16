import java.util.*;

public class Reader {
    private Scanner reader = new Scanner(System.in);
    
    public Reader() {
    }
    
    public String readString() {
        return reader.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(reader.nextLine());
    }
    
}