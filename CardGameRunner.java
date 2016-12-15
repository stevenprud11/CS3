/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 */ 

import java.util.*;

public class CardGameRunner {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (Suit s : Suit.values())
        {
        	
            for (Rank r : Rank.values()) 
            {
                Card card = deck.getCard(s.getSuit(), r.getCard());
               // System.out.println(card.getSuit());
                System.out.format("%s of %s%n", card.getRank(), card.getSuit());
            }
        }
    }
}