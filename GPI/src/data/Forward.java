package data;

public class Forward extends Player {
	private int perfect_shoot;
	private int drible;
	
	public Forward(int speed,int shooting_skills,int exhaust
			,boolean wounded,boolean substitute ,int perfect_shoot,int drible) {
		super(speed,shooting_skills,exhaust,wounded,substitute);
		this.perfect_shoot=perfect_shoot;
		this.drible=drible;
	}

	public int getPerfect_shoot() {
		return perfect_shoot;
	}

	public void setPerfect_shoot(int perfect_shoot) {
		this.perfect_shoot = perfect_shoot;
	}

	public int getDrible() {
		return drible;
	}

	public void setDrible(int drible) {
		this.drible = drible;
	}
	
	
}
