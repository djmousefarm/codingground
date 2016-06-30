import java.util.*;
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cardsInHand;
    
    public Hand () {
        this.cardsInHand = new ArrayList<Card>();
    }
    
    public void add (Card card) {
        cardsInHand.add(card);
    }
    
    public void print() {
        for (Card card : cardsInHand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cardsInHand);
    }
    
    @Override
    public int compareTo(Hand hand) {
        int value = handValue(this);
        int handValue = handValue(hand);

        if (handValue<value) {
            return 1;
        } else if (handValue>value) {
            return -1;
        } else {
            return 0;
        }
    }
    
    public int handValue (Hand hand) {
        int value = 0;
        for (Card card : hand.cardsInHand) {
            value += card.getValue();
        }
        return value;
    }
    
}