import java.util.*;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addThing (Thing thing) {
        things.add(thing);
    }
    
    public String toString() {
        int noOfThings = things.size();
        int weightOfThings = totalWeight();
        
        return noOfThings + " " + this.referenceToThings(noOfThings) + " (" + weightOfThings + "kg)";
    }
    
    public String referenceToThings(int noOfThings) {
        if (noOfThings==0) {
            return "empty";
        } else if (noOfThings==1) {
            return "thing";
        } else {
            return "things";
        }
    }
    
    public void printThings() {
        for (Thing allThings : things) {
            System.out.println(allThings.toString());
        }
    }
    
    public int totalWeight() {
        int weightOfThings = 0;
        for (Thing eachThing : things) {
            weightOfThings += eachThing.getWeight();
        }
        return weightOfThings;
    }
    
    public Thing heaviestThing () {
        Thing heavy = new Thing(null,0);
        if (things.size()==0) {
            return null;
        } else {
            int currentBiggest = 0;
            for (Thing eachThing : things) {
                if (eachThing.getWeight()>currentBiggest) heavy=eachThing;
            }
        }
        return heavy;
    }
    
}