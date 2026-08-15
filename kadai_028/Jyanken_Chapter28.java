package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	String input;
	String[] jyanken = {"r", "s", "p"};
	int a = (int) Math.floor(Math.random() * 3);

	public String getMyChoice() {
		
		System.out.println("じゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		// Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		// 入力した内容を取得する
		input = scanner.next();
		
		// 正しいじゃんけんの手であるか判定する
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			return input;
		} else {
			System.out.println("正しいじゃんけんの手ではありません");
			return getMyChoice();
		}
		
	}
	
	public String getRandom() {
		
		// 配列にじゃんけんの手をセットする
		return jyanken[a];
		
	}
	
	public void playGame(String key) {
		
		HashMap<String,String> jyankenMap = new HashMap<String,String>();
		
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		// 自分と対戦相手のじゃんけんの手を出力する
		
		if (input.equals("r") && jyanken[a].equals("r")) {
			System.out.println("自分の手は" + jyankenMap.get("r") + ",対戦相手の手は" + jyankenMap.get("r"));
		}else if (input.equals("r") && jyanken[a].equals("s")) {
			System.out.println("自分の手は" + jyankenMap.get("r") + ",対戦相手の手は" + jyankenMap.get("s"));
		}else if (input.equals("r") && jyanken[a].equals("p")) {
			System.out.println("自分の手は" + jyankenMap.get("r") + ",対戦相手の手は" + jyankenMap.get("p"));
		}else if (input.equals("s") && jyanken[a].equals("r")) {
			System.out.println("自分の手は" + jyankenMap.get("s") + ",対戦相手の手は" + jyankenMap.get("r"));
		}else if (input.equals("s") && jyanken[a].equals("s")) {
			System.out.println("自分の手は" + jyankenMap.get("s") + ",対戦相手の手は" + jyankenMap.get("s"));
		}else if (input.equals("s") && jyanken[a].equals("p")) {
			System.out.println("自分の手は" + jyankenMap.get("s") + ",対戦相手の手は" + jyankenMap.get("p"));
		}else if (input.equals("p") && jyanken[a].equals("r")) {
			System.out.println("自分の手は" + jyankenMap.get("p") + ",対戦相手の手は" + jyankenMap.get("r"));
		}else if (input.equals("p") && jyanken[a].equals("s")) {
			System.out.println("自分の手は" + jyankenMap.get("p") + ",対戦相手の手は" + jyankenMap.get("s"));
		}else if (input.equals("p") && jyanken[a].equals("p")) {
			System.out.println("自分の手は" + jyankenMap.get("p") + ",対戦相手の手は" + jyankenMap.get("p"));
		}
		
		
		// 自分と対戦相手のじゃんけんの手を比較して、結果を出力する
		
		if (input.equals("r") && jyanken[a].equals("r")) {
			System.out.println("あいこです");
		}else if (input.equals("r") && jyanken[a].equals("s")) {
			System.out.println("自分の勝ちです");
		}else if (input.equals("r") && jyanken[a].equals("p")) {
			System.out.println("自分の負けです");
		}else if (input.equals("s") && jyanken[a].equals("r")) {
			System.out.println("自分の負けです");
		}else if (input.equals("s") && jyanken[a].equals("s")) {
			System.out.println("あいこです");
		}else if (input.equals("s") && jyanken[a].equals("p")) {
			System.out.println("自分の勝ちです");
		}else if (input.equals("p") && jyanken[a].equals("r")) {
			System.out.println("自分の勝ちです");
		}else if (input.equals("p") && jyanken[a].equals("s")) {
			System.out.println("自分の負けです");
		}else if (input.equals("p") && jyanken[a].equals("p")) {
			System.out.println("あいこです");
		}
	}
}
