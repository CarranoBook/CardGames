/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgames;

/**
 *
 * @author nbleier
 */
public class Card {
    Suit suit;
    int value;
    
    public Card(String suit, int val) {
        if ( val < 1 || val > 13 )
            throw new IllegalStateException("Card must be between 1 and 13");
        value = val;
        this.setSuit(suit);
    }
    
    private void setSuit(String suit) {
        suit = suit.toLowerCase();
        
        switch (suit) {
            case "diamond":
                this.suit = Suit.DIAMOND;
                break;
            case "heart":
                this.suit = Suit.HEART;
                break;
            case "club":
                this.suit = Suit.CLUB;
                break;
            case "spade":
                this.suit = Suit.SPADE;
                break;
            default:
                throw new IllegalStateException("Suit is not valid");
        }
    }
    
    public String getSuit() {
        return this.suit.getSuit();
    }
    
    public int getCardNum() {
        return this.value;
    }
    
    public String toString() {
        return this.getCardValueString() + " of " + suit.getSuit()+"s";
    }
    
    public String getCardValueString() {
        switch (this.value) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13: return "King";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            default:
                break;
        }
        return "";
    }
    
    public boolean equals(Card c) {
        if ( c.getCardNum() != this.value )
            return false;
        if ( !c.getSuit().equals(this.getSuit()) )
            return false;
        
        return true;
    }

    private enum Suit {
        DIAMOND("Diamond"), HEART("Heart"), CLUB("Club"), SPADE("Spade");
        private final String name;
        
        private Suit(String suit) {
            name = suit;
        }
        
        private String getSuit() {
            return name;
        }
    }
}
