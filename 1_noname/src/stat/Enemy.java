package stat;

public class Enemy extends EnemySkill{

	private int enemyNumber;
	private int enemyHp;
	private int enemySpeed;
//	private int enemyExp;

	public Enemy(int enemyNumber) {
		switch (enemyNumber) {
		case 1:
			this.enemyNumber = 1;
			this.enemyHp = 30;
			this.enemySpeed = 5;
			break;
		case 2:
			this.enemyNumber = 2;
			this.enemyHp = 50;
			this.enemySpeed = 3;
			break;
		case 3:
			this.enemyNumber = 3;
			this.enemyHp = 75;
			this.enemySpeed = 0;
			break;
		}
	}

	public int getEnemyHp() {
		return enemyHp;
	}

	public void setEnemyHp(int enemyHp) {
		this.enemyHp = enemyHp;
	}
	
	public int getEnemyNumber() {
		return this.enemyNumber;
	}
	
	public int getEnemySpeed() {
		return this.enemySpeed;
	}
}
