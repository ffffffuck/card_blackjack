package kr.co.Blackjack;

import kr.co.Blackjack.Card.Card;
import kr.co.Blackjack.Card.CardDeck;
import kr.co.Blackjack.Player.*;

public class blackjack {
	public static void main(String[] args) {
		CardDeck c = new CardDeck();
		Gamer g = new Gamer();
		Dealer d = new Dealer();
		Card ff = null;
		
		c.CardDeck();
		
		g.Gamer();
		d.Dealer();
		d.Dealer();
		

	}
}
