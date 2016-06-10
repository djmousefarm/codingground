import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Results currentResults = new Results();
        currentResults.inputResults(scanner);
        System.out.println();
        currentResults.gradeDistribution();
        System.out.println();
        currentResults.acceptancePercent();
    }
}

