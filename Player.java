package MaruBatuGame;

import java.util.Scanner;

public class Player {
	
	private String name;
	private String typeKoma;
	private Scanner scanner = new Scanner(System.in);
			
	public Player(String name, String koma){
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
		this.typeKoma = koma;	
	}
	
	public int[] chooseSpace() {
		int[] place = new int[2];
		while(true) {
			
			System.out.print("縦を0 ～ 2で選んでください。 > ");
			place[0] = scanner.nextInt();
			
			if(place[0] == 0 || place[0] == 1 || place[0] == 2) {
				break;
			} else {
				System.out.println("0から2で選択してください。");
				System.out.println("もう一度。");
			}	
		}
		while(true) {
			System.out.print("横を0 ～ 2で選んでください。 > ");
			place[1] = scanner.nextInt();
			
			if(place[1] == 0 || place[1] == 1 || place[1] == 2) {
				break;
			} else {
				System.out.println("0から2で選択してください。");
				System.out.println("もう一度。");
			}	
		}
		return place;
		
	}

	public String getTypeKoma() {
		return typeKoma;
	}

	public String getName() {
		return name;
	}
}
