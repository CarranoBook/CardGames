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
public abstract class CardDeck {
    static Card[] arrDeck;
    
    private CardDeck() {
        generateDeck();
    }

    private static void generateDeck() {
        int count = 0;
        arrDeck = new Card[52];
        for ( int i = 1; i < 14; i++ ) {
            arrDeck[count] = new Card("spade", i);
            count++;
            arrDeck[count] = new Card("club", i);
            count++;
            arrDeck[count] = new Card("heart", i);
            count++;
            arrDeck[count] = new Card("diamond", i);
            count++;
        }
    }
}
