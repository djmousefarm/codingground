import java.util.Scanner;

public class Results {
    private int[] Grades = new int[6];
    private int Accepted;
    private int numberOfResults;
    
    public Results() {
        this.Accepted = 0;
        this.numberOfResults = 0;
    }
    
    public void inputResults(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int value = Integer.parseInt(scanner.nextLine());
            if (value==-1) {
                break;
            } else {
                if (value<=60 && value>0) {  // something to ignore silly values
                    calculateGrade(value);
                    numberOfResults++;
                }
            }
        }
    }

    public void calculateGrade(int currentResult) {
        // Takes results as integers and updates an array of grades
        if (currentResult>49) {
            Grades[5]++;
        } else if (currentResult>44) {
            Grades[4]++;
        } else if (currentResult>39) {
            Grades[3]++;
        } else if (currentResult>34) {
            Grades[2]++;
        } else if (currentResult>29) {
            Grades[1]++;
        } else {
            Grades[0]++;
        }
        if (currentResult>=29) Accepted++;  // something to just count the pass grades
    }


    public void gradeDistribution () {
        System.out.println("Grade distribution:");      // Outputs the grade distribution block
        for (int i = Grades.length-1; i >= 0 ; i--) {
            gradeOutput(i);                             // calls the gradeOutput method for handling each line
        }
    }
    
    public void gradeOutput(int number) {
        System.out.print(number + ": ");            // By each grade outputs "n: ***" where n = the grade
        for (int i = 0; i < Grades[number]; i++) {  // and the number of stars is how many people got that grade
            System.out.print("*");
        }
        System.out.println();
    }

    public void acceptancePercent () {
        Double aPercent = 100 * (Accepted / (numberOfResults*1.0));
        System.out.println("Acceptance percentage: " + aPercent);
    }

}