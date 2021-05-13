package MaruBatuGame;

public class MatuBatuGame {
	public static void main(String[] args) {
		Board board = new Board();
		
		Player aPlayer = new Player("EIJI", "〇");
		Player bPlayer = new Player("MIKI", "×");
		
		int count = 0;
		boolean finish = false;
		while(count < 9) {
			board.displayBoard();
			board.startPlaying(count % 2 == 0 ? aPlayer : bPlayer);
			
			
			
			count++;
		}
		
		if(count == 9) {
			System.out.println("引き分けです。");
		}	
		
		System.out.println();
		System.out.println("======最終結果======");
		board.displayBoard();
		
	}
}
