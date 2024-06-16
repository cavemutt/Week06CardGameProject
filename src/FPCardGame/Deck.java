package FPCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> newDeck = new ArrayList<>();
	
	public Deck() {
		String[] cardSuits = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String[] cardNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

		for (String suit : cardSuits) {
			int value = 2;
			for (String name : cardNames) {
				Card card = new Card(name, suit, value);
				this.newDeck.add(card);
				value++;
			}
		}
	}
	
	public void describe() {
		for (Card card : this.newDeck) {
			card.describe();
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(newDeck);
	}
	
	public Card draw() {
		Card card = this.newDeck.remove(0);
		card.describe();
		return card;
	}

	public List<Card> getNewDeck() {
		return newDeck;
	}

	public void setNewDeck(List<Card> newDeck) {
		this.newDeck = newDeck;
	}
	
	
}
