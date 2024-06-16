package FPCardGame;

//import java.util.ArrayList;
//import java.util.List;

public class CardGame {

	public static void main(String[] args) {

//		Create new deck
		Deck myDeck = new Deck();
		System.out.println("New deck created :\n");
		myDeck.describe();
//		Shuffle the deck
		System.out.println("The deck is now shuffled : \n");
		myDeck.shuffleDeck();
		myDeck.describe();
		
//		Create two players
		System.out.println("This Game of War will have two players :");
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
//		Deal cards to the players
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(myDeck);
			} else {
				player2.draw(myDeck);
			}
		}
		
		player1.describe();
		player2.describe();
		
//		Start the game
		System.out.println("******************************************");
		System.out.println("*********** Begin the Game **************");

//		each round of the game
		for (int i = 1; i <= 26; i++) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~ Round " + i + " ~~~~~~~~~~~");
//			starting scores
			System.out.println("Current Score : " + player1.getName() + " - " + player1.score + " vs " + player2.getName() + " - " + player2.score);
//			play each round
			System.out.println(player1.getName() + " plays the card : \n");
			Card p1card = player1.flip();
			p1card.describe();
			System.out.println(player2.getName() + " plays the card : \n");
			Card p2card = player2.flip();
			p2card.describe();
//			who wins and scores each round
			if (p1card.value > p2card.value) {
				System.out.println("******* Round " + i + " Winner is ********" );
				System.out.println("************* " + player1.getName() + " **************" );
				player1.incrementScore();				
			} else if (p1card.value < p2card.value) {
				System.out.println("******* Round " + i + " Winner is ********" );
				System.out.println("************* " + player2.getName() + " **************" );
				player2.incrementScore();				
			} else {
				System.out.println("*** It's a TIE ! ***");
			}
		}
//		Who wins the game
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~ The Winner of this game is : ~~~~~~~~~~~");
		if (player1.score > player2.score) {
			System.out.println("~~~~~~~~~~~~~~~ " + player1.getName() + "~~~~~~~~~~~~~~~~~~");
		} else if (player1.score < player2.score) {
			System.out.println("~~~~~~~~~~~~~~~ " + player2.getName() + "~~~~~~~~~~~~~~~~~~");
		} else {
			System.out.println("~~~~~~~~~~~~~~~ Nobody, it's a TIE ! ~~~~~~~~~~~~~~~~~~");			
		}
		
		System.out.println("* * * * * * * Game Over * * * * * * * *");
	}
}
