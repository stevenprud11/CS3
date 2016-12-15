/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 */ 

import java.util.*;

public class Deck {

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = 52;

    private Card[] cards;

    public Deck() {
        cards = new Card[52];
       int i = 0;
        for(Suit s : Suit.values())
        {
        	
        	for( Rank r: Rank.values())
        	{
        		
        		cards[i++] = new Card(r,s);
        		
            }
        	
        }
    }

    public Card getCard(String suit, String rank) {
       for(int i =0; i<52;i++)
    	   {
    	   		if(cards[i].getSuit().equals(suit) && cards[i].getRank().equals(rank))
    	   			return cards[i];
    	   }
       return null;
    }
}