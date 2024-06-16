package FPCardGame;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public void describe() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name + " has a score of " + score + " and a hand of : ");
		for (Card card : hand) {
			card.describe();
		}
	}

	public void draw (Deck myDeck) {
		hand.add(myDeck.draw());
	}
	
	public Card flip () {
		return hand.remove(0);
	}
	
	public void incrementScore() {
		score++;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
