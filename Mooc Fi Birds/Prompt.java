import java.util.Scanner;
import java.util.ArrayList;

public class Prompt {
    private String command;
    private ArrayList<String> listOfCommands;
    private Book ledger = new Book();
    
    public Prompt () {
        this.listOfCommands = new ArrayList<String>();
        this.listOfCommands.add("ADD");
        this.listOfCommands.add("OBSERVATION");
        this.listOfCommands.add("STATISTICS");
        this.listOfCommands.add("SHOW");
    }
    
    public void input (Scanner scanner) {
        System.out.print("?");
        while(true) {
            command = scanner.nextLine();
            if (command.toUpperCase().equals("QUIT")) {
                break;
            } else {
                if (goodCommand(command)) {
                    actOnCommand(command, scanner);
                }
            }
        }
    }
    
    public boolean goodCommand (String thisCommand) {
        return (listOfCommands.contains(thisCommand.toUpperCase()));
    }
    
    public void actOnCommand (String thisCommand, Scanner scanner) {
        String casedCommand = thisCommand.toUpperCase();
        if (casedCommand.equals("ADD")) {
            add(scanner);
        } else if (casedCommand.equals("OBSERVATION")) {
            System.out.println("Observation Command");
        } else if (casedCommand.equals("STATISTICS")) {
            statistics();
        } else if (casedCommand.equals("SHOW")) {
            System.out.println("Show Command");
        } else {
            System.out.println("This shouldn't happen!");
        }
    }

    public void add(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latinName = scanner.nextLine();
        Bird newBird = new Bird(name,latinName);
        ledger.addBird(newBird);
    }
    
    public void feedback () {
        System.out.println(command);
    }
    
    public void statistics () {
        System.out.print(ledger);
    }

}