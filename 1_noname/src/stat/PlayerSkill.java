package stat;

import java.util.Random;

public class PlayerSkill implements Skill {

	// 데미지 -> 기본+랜덤가중치
	// hp 받아서 데미지 계산하고 hp 리턴
	Random rd = new Random();
	private int demege;

	@Override
	public int skill_1(int hp) {
		if (rd.nextInt(99) + 1 >= 70)
			setDemege(3 + (rd.nextInt(2) + 1) + (rd.nextInt(1) + 1)); // 크리티컬
			
		else
			setDemege(3 + (rd.nextInt(2) + 1)); //일반
		return hp - getDemege();
	}

	@Override
	public int skill_2(int hp) {
		return 0;
	}

	@Override
	public int skill_3(int hp) {
		return 0;
	}

	@Override
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
