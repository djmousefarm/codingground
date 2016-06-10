import java.util.Scanner;

public class Prompt {
    private String command;
    
    public Prompt () {
    }
    
    public void input (Scanner scanner) {
        command = scanner.nextLine();
    }
    
    public void feedback () {
        System.out.println(command);
    }
    
}