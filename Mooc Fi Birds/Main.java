import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prompt console = new Prompt();

        console.input(scanner);
        console.feedback();

    }
}

