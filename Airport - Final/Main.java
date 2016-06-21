import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        UserInterface UI = new UserInterface(reader);
        //Dictionary dict = new Dictionary();
        //UI.start();
        UI.airportPanel();
    }
}
