package MaruBatuGame;


public class Board {
	
	private String[][] board;
	
	public Board() {
		this.board = new String[3][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.board[i][j]= "　"; 
			}
		}
	}
	
	// TODO : 勝者を判定する。
	public boolean chcek_winner() {
		
		// 横のチェック
		for(int row = 0; row < 3; row++) {
			if(board[row][0] == board[row][1] && board[row][0] == board[row][2] && board[row][0] != "　") {
				return true;
			}
		}
		
		// 縦のチェック
		for(int col = 0; col < 3; col++) {
			if(board[0][col] == board[1][col] && board[0][col] == board[2][col] && board[0][col] != "　") {
				return true;
			}
		}
		
		// ななめチェック(左上から右下)
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != "　") {
			return true;
		}
		
		if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != "　") {
			return true;
		}
		return false;
	}
	
	public boolean startingPlaying(Player player){
		System.out.println();
		System.out.println(player.getName() + "さんの番です");
		addKoma(player);
		if(chcek_winner()) {
			System.out.println(player.getName() + "さんの勝ちです");
			return true;
		}
		return false;
	}
	
	// TODO : マスに駒を置く関数
	public void addKoma(Player turnPlayer){
		
		while(true) {
			int[] place = turnPlayer.chooseSpace();		
			if(this.board[place[0]][place[1]] != "　") {
				System.out.println("もうすでに埋められている場所なのでやり直してください。");
				continue;
			} else {
				this.board[place[0]][place[1]] = turnPlayer.getTypeKoma();
				break;
			}
		}
	}
	
	// TODO : マスを表示する関数
	public void displayBoard() {
		System.out.println("    0 | 1  | 2");
		System.out.println("  -------------");
		System.out.println("0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("  -------------");
		System.out.println("1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("  -------------");
		System.out.println("2  " +board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}
	
}
