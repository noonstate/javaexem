package stat;

// 생성자도 오버로딩된다
public class Player extends PlayerSkill {

	private int playerHp;
	private int playerSpeed;
//	private int playerExp;
//	private int playerLevel;
	
	public Player() {
		this.playerHp = 100;
		this.playerSpeed = 3;
		
	}
	public Player(int hp) {
		this.playerHp = hp;
	}
	
	
	public int getPlayerHp() {
		return playerHp;
	}
	public void setPlayerHp(int playerHp) {
		this.playerHp = playerHp;
	}

	public int getPlayerSpeed() {
		return playerSpeed;
	}
}
