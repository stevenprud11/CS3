/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 */ 

public class Card {
    private Rank rank;
    private Suit suit;


    public Card(Rank r, Suit s) 
    {
        rank = r;
        suit = s;
            
    }

    public String getSuit() {
        return suit.getSuit();
    }

    public String getRank() {
        return rank.getCard();
    }

    public static boolean isValidRank(int rank) {
        return 1 <= rank && rank <= 13;
    }

    public static boolean isValidSuit(int suit) {
        return 1 <= suit && suit <= 4;
    }

    

  /*  public static void main(String[] args) {
    	
    	// must run program with -ea flag (java -ea ..) to
    	// use assert statements
        assert rankToString(ACE) == "Ace";
        assert rankToString(DEUCE) == "Deuce";
        assert rankToString(THREE) == "Three";
        assert rankToString(FOUR) == "Four";
        assert rankToString(FIVE) == "Five";
        assert rankToString(SIX) == "Six";
        assert rankToString(SEVEN) == "Seven";
        assert rankToString(EIGHT) == "Eight";
        assert rankToString(NINE) == "Nine";
        assert rankToString(TEN) == "Ten";
        assert rankToString(JACK) == "Jack";
        assert rankToString(QUEEN) == "Queen";
        assert rankToString(KING) == "King";

        assert suitToString(DIAMONDS) == "Diamonds";
        assert suitToString(CLUBS) == "Clubs";
        assert suitToString(HEARTS) == "Hearts";
        assert suitToString(SPADES) == "Spades";

    }*/
}