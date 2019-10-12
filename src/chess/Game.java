package chess;


public class Game {
	
	private Square[8][8] gameBoard; // rank (horizontal, starting at bottom (for white)) x file (vertical, starting left (for white))
	
	private Player whitePlayer;
	private Player blackPlayer;
	
	
	public Game(String[] playerNames) {
		
		if (playerNames.length < 2) {
			if (playerNames.length < 1) {
				playerNames = {"Default1"};
			}
			playerNames = {playerNames[0], "Default2"}
		}
		
		whitePlayer = new Player(Color.WHITE, playerNames[0]);
		blackPlayer = new Player(Color.BLACK, playerNames[1]);

		for (int rankCount = 0; rankCount < 8; ++rankCount) { // horizontal (1-8)
			for (int fileCount = 0; fileCount < 8; ++fileCount) { // vertical (a-h)

				Color color;
				Rank rank;
				File file;

				(file + rank) % 2 == 0 ? color = BLACK : color = WHITE;
				rank = Rank.valueof(Integer.toString(rankCount)); // 1 -> (Rank) 1, ...
				file = Character.toString((char) (fileCount + 97)); // 1 -> a, 2 -> b, ...

				gameBoard[rankCount][fileCount] = new Square(color, rank, file);
			}
		}

		piecesSetup();
	}


	// set up pieces at start of game
	private void piecesSetup() {
		// set up pieces at start of game
	}


	public boolean isValidMove(String moveDescription) {
		// determine piece
		// check if valid move
	}


	public void makeMove(String moveDescription) {
		if (isValidMove(moveDescription)) {
			// make move
		}
	}


	public String toString() {
		return "";
	}
}