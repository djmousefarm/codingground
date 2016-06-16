
import java.util.*;
public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please type a word : ");
        String word = scanner.nextLine();
        System.out.println();
        
        Histo Histogram = new Histo();
        
        Histogram.processHisto(word);
        
    }

}