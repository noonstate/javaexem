package stat;

import java.util.Random;

public class EnemyNumberOne extends Enemy {
	Random rd = new Random();
	private int demege;
	
	public EnemyNumberOne(int number) {
		super(number);
	}
	
	@Override
	public int skill_1(int hp) {
		if (rd.nextInt(99) + 1 >= 70)
			setDemege(3 + (rd.nextInt(4))); // 크리티컬
		else
			setDemege(3 + (rd.nextInt(2))); // 일반
		return hp - getDemege();
	}

	@Override
	public int skill_2(int hp) {
		if (rd.nextInt(99) + 1 >= 60)
			setDemege(1 + (rd.nextInt(5))); // 크리티컬
		else
			setDemege(1 + (rd.nextInt(2))); // 일반
		return hp - getDemege();
	}

	@Override
	public int skill_3(int hp) {
		if (rd.nextInt(99) + 1 >= 90)
			setDemege(3 + (rd.nextInt(7))); // 크리티컬
		else
			setDemege(3 + (rd.nextInt(2))); // 일반
		return hp - getDemege();
	}

	@Override
	public int skill_4(int hp) {
		if (rd.nextInt(99) + 1 >= 45)
			setDemege(2 + (rd.nextInt(2))); // 크리티컬
		else
			setDemege(2 + (rd.nextInt(1))); // 일반
		return hp - getDemege();
	}

	public int getDemege() {
		return demege;
	}

	public void setDemege(int demege) {
		this.demege = demege;
	}

}
