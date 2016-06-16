import java.util.*;

public class Calculator {
    private Reader reader = new Reader();
    private int[] values = new int[2];
    private int counter = 0;
    
    public Calculator() {

    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private int[] readValue () {     // for reading in values
        for (int i = 0;i < 2;i++) {
            System.out.print("Value" + (i+1) + ":");
            values[i] = reader.readInteger();
        }
        return values;
    }
    
    private void sum() {
        int[] values = readValue();
        int Value = values[0] + values[1];
        System.out.println("sum of the values " + Value);
        this.counter++;
    }
    
    private void difference() {
        int[] values = readValue();
        int Value = Math.abs(values[0] - values[1]);        
        System.out.println("difference of the values " + Value);
        this.counter++;
    }
    
    private void product() {
        int[] values = readValue();        
        int Value = values[0] * values[1];
        System.out.println("product of the values " + Value);
        this.counter++;    
    }

    private void statistics() {
        System.out.println("Calculations done " + this.counter);
    }

}