import java.util.Random;
import java.util.Scanner;

import stat.*;

public class Main {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		Enemy enemy = new Enemy(rd.nextInt(2) + 1); // 적 로드
		Battle battle = new Battle();

		while (true) {
			// 스피드체크, 선턴판정
			if (battle.speedCheck(player.getPlayerSpeed(), enemy.getEnemySpeed())) {
				System.out.println("플레이어");
				battle.playerPhase(player, enemy);
				battle.enemyPhase(player, enemy);
			}
			else {
				System.out.println("적");
				battle.enemyPhase(player, enemy);
				battle.playerPhase(player, enemy);
			}

			if (battle.hpCompare(player.getPlayerHp()) || battle.hpCompare(enemy.getEnemyHp())) {
				{
					break;
				}
			}
		}
		

	}
}
