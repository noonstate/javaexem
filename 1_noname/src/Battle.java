import java.util.Random;
import java.util.Scanner;

import stat.*;

public class Battle {
	// 적, 플레이어
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	
	// 플레이어 움직임
	public void playerPhase(Player player, Enemy enemy) {
		System.out.println("입력");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("1번 공격");
			player.skill_1(enemy.getEnemyHp());
			System.out.println(player.getDemege());
			System.out.println(enemy.getEnemyHp());
			break;
		case 2:
			System.out.println("2번 공격");
			player.skill_2(enemy.getEnemyHp());
			System.out.println(player.getDemege());
			System.out.println(enemy.getEnemyHp());
			break;
		case 3:
			System.out.println("3번 공격");
			player.skill_3(enemy.getEnemyHp());
			System.out.println(player.getDemege());
			System.out.println(enemy.getEnemyHp());
			break;
		case 4:
			System.out.println("4번 공격");
			player.skill_4(enemy.getEnemyHp());
			System.out.println(player.getDemege());
			System.out.println(enemy.getEnemyHp());
			break;
		}
	}
	
	// 적 움직임
	public void enemyPhase(Player player, EnemyNumberOne enemy) {
		switch (rd.nextInt(3)+1) {
		case 1:
			System.out.println("1번 공격");
			enemy.skill_1(player.getPlayerHp());
			System.out.println(enemy.getDemege());
			System.out.println(player.getPlayerHp());
			break;
		case 2:
			System.out.println("2번 공격");
			enemy.skill_2(player.getPlayerHp());
			System.out.println(enemy.getDemege());
			System.out.println(player.getPlayerHp());
			break;
		case 3:
			System.out.println("3번 공격");
			enemy.skill_3(player.getPlayerHp());
			System.out.println(enemy.getDemege());
			System.out.println(player.getPlayerHp());
			break;
		case 4:
			System.out.println("4번 공격");
			enemy.skill_4(player.getPlayerHp());
			System.out.println(enemy.getDemege());
			System.out.println(player.getPlayerHp());
			break;
		}
	}
	//스피드 체크
	public boolean speedCheck(int playerSpeed, int enemySpeed) {
		if (playerSpeed < enemySpeed) {
			return true;
		} else {
			return false;
		}
	}

	// 체력비교
	public boolean hpCompare(int hp) {
		if (hp <= 0) {
			return true;
		} else {
			return false;
		}
	}

}
