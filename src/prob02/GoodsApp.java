package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		for (int i = 0; i < goods.length; i++) {
			String info = scanner.nextLine();
			String[] tokens = info.split(" ");

			goods[i] = new Goods(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
		}
		
		for (Goods g : goods) {
			g.showInfo();
		}
	}
}