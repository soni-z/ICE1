/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @modifier zeel soni
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
      
        Card[] magicHand = new Card[7];
  
      
//            Card game = new Card();
            for (int i = 0; i < magicHand.length; i++) {

                // step 1: generate 7 random cards and store in array
                Card c = new Card();
            

                c.setValue(value);//random generation for number/use method
//          c.setSuit("suit by random suit generation"+Card.SUITS[crdSuit]);
                magicHand[i] = c; // stores the card object  in array
                c.setSuit(Card.SUITS[crdSuit]);
                System.out.println("Random cards generated are : ");
      
               
//                System.out.println(" The suit is " + c.getSuit() + " and card number is " + c.getValue() + "\n");
            }
    
}
}
