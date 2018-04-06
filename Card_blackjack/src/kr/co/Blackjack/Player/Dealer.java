package kr.co.Blackjack.Player;

import kr.co.Blackjack.Card.Card;
import kr.co.Blackjack.Card.CardDeck;

public class Dealer {
	CardDeck Deck = new CardDeck();
	
	public void Dealer(){
	Deck.CardPick();
	}

}