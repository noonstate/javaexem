import java.util.Random;
import java.util.Scanner;

import stat.*;

public class Battle {
	// 적, 플레이어
	public void battle() {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		Enemy enemy = new Enemy(rd.nextInt(2) + 1);

		while (true) {
			// 스피드체크, 선턴판정

			System.out.println("입력");
			switch (sc.nextInt()) {
			case 1:
				player.skill_1(enemy.getEnemyHp());
				break;
			case 2:
				player.skill_2(enemy.getEnemyHp());
				break;
			case 3:
				player.skill_3(enemy.getEnemyHp());
				break;
			case 4:
				player.skill_4(enemy.getEnemyHp());
				break;
			}
		}
	}
	
//	public boolean speedCheck() {
//		if 
//	}
}
