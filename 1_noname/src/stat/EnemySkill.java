package stat;

import java.util.Random;

public class EnemySkill implements Skill {
	Random rd = new Random();
	private int demege;

	public int skill_1(int hp) {
		if (rd.nextInt(99) + 1 >= 70)
			setDemege(3 + (rd.nextInt(2) + 1) + (rd.nextInt(1) + 1)); // 크리티컬
		else
			setDemege(3 + (rd.nextInt(2) + 1)); // 일반
		return hp - getDemege();
	}

	public int skill_2(int hp) {
		return 0;
	}

	public int skill_3(int hp) {
		return 0;
	}

	public int skill_4(int hp) {
		return 0;
	}

	public int getDemege() {
		return demege;
	}

	public void setDemege(int demege) {
		this.demege = demege;
	}

}
