import java.util.*;
public class Main{

     public static void main(String []args){
        
        Hand hand = new Hand();

        hand.add( new Card(12, Card.HEARTS) );
        hand.add( new Card(4, Card.CLUBS) );
        hand.add( new Card(2, Card.DIAMONDS) );
        hand.add( new Card(14, Card.CLUBS) );
        hand.add( new Card(7, Card.HEARTS) );
        hand.add( new Card(2, Card.CLUBS) );

        hand.sortAgainstSuit();

        hand.print();
        
        /*
        
        Test for SortAgainstSuit but i already modified to test sorting
        against value as well!
        
        ArrayList<Card> cards = new ArrayList<Card>();

        cards.add( new Card(3, Card.CLUBS) );
        cards.add( new Card(2, Card.DIAMONDS) );
        cards.add( new Card(14, Card.CLUBS) );
        cards.add( new Card(12, Card.HEARTS) );
        cards.add( new Card(2, Card.CLUBS) );

        //SortAgainstSuit suitSorter = new SortAgainstSuit();
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, suitSorter );

        for (Card c : cards) {
            System.out.println( c );
        }
        */
        
        /*
        
        Hand sorting test
        
        Hand hand1 = new Hand();

        hand1.add( new Card(2, Card.SPADES) );
        hand1.add( new Card(14, Card.CLUBS) );
        hand1.add( new Card(12, Card.HEARTS) );
        hand1.add( new Card(2, Card.CLUBS) );

        Hand hand2 = new Hand();

        hand2.add( new Card(11, Card.DIAMONDS) );
        hand2.add( new Card(11, Card.CLUBS) );
        hand2.add( new Card(11, Card.HEARTS) );

        int comparison = hand1.compareTo(hand2);

        if ( comparison < 0 ) {
            System.out.println("the most valuable hand contains the cards");
            hand2.print();
        } else if ( comparison > 0 ){
            System.out.println("the most valuable hand contains the cards");
            hand1.print();
        } else {
            System.out.println("the hands are equally valuable");
        }
        */
        
        /*
        
        This code was for testing the hands of cards
        
        Hand hand = new Hand();

        hand.add( new Card(2, Card.SPADES) );
        hand.add( new Card(14, Card.CLUBS) );
        hand.add( new Card(12, Card.HEARTS) );
        hand.add( new Card(2, Card.CLUBS) );
        
        hand.sort();

        hand.print();
        
        // List<Card> cards = new ArrayList<Card>();
        
        // clubMembers.add(new ClubMember("mikael", 182));
        
        /*
        
        This code was all used to test the sortation
        
        cards.add(new Card(2, Card.DIAMONDS));
        cards.add(new Card(14, Card.CLUBS));
        cards.add(new Card(12, Card.HEARTS));
        cards.add(new Card(12, Card.SPADES)); 
        cards.add(new Card(12, Card.CLUBS));         
        cards.add(new Card(13, Card.SPADES));        
        cards.add(new Card(9, Card.SPADES));   
        cards.add(new Card(4, Card.CLUBS));
        cards.add(new Card(3, Card.CLUBS)); 
        cards.add(new Card(2, Card.DIAMONDS));         

        //System.out.println(first);
        //System.out.println(second);
        //System.out.println(third);
        System.out.println(cards);
        Collections.sort(cards);
        System.out.println(cards);        
        */
     }
}
