package kr.co.Blackjack.Card;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {
	static ArrayList cardDeck = new ArrayList();
	static Card carddeck[] = new Card[52];
	static Random r = new Random();
	Card c;
	int cnt =0;
	
	public void CardDeck(){
	for(int i=0; i<4; i++) {
		for(int j=0; j<13; j++) {
			c = new Card();
			c.setNo(j+1);
			
			switch(j) {
			case 9:
				c.setNo("A");
				break;
			case 10:
				c.setNo("K");
				break;
			case 11:
				c.setNo("Q");
				break;
			case 12:
				c.setNo("J");
				break;
			}
		    switch(i) {
		    case 0:
		     c.setShape("스페이스");
		     break;
		    case 1:
		     c.setShape("하트");
		     break;
		    case 2:
		     c.setShape("클로버");
		     break;
		    case 3:
		     c.setShape("다이아");
		     break;  
		    }
		    cardDeck.add(c);
		    carddeck[cnt++] = c;
		    
		    
			}
		}

	}
	
	public void CardPick() {
		int x = r.nextInt(cardDeck.size());
		cardDeck.get(x);
		System.out.println(cardDeck.get(x));
		cardDeck.remove(x);
//		System.out.println(cardDeck.size());

	}
	
}
