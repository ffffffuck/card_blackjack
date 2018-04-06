package kr.co.Blackjack.Card;

public class Card {
	private String shape;
	private String no;
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getNo() {
		return no+"";
	}
	public void setNo(Object no) {
		this.no= no+"";
	}
	public String toString() {
		return String.format("%s - %s\n",shape,no);
	}
}
