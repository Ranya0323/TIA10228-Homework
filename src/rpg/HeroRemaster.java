package rpg;

public class HeroRemaster {
	protected String name;
	private int level;
	private double exp;
	private IAttackAction attackAction;
	private IDefendAction defendAction;
	private IRunAction runAction;
	
	public void setAttackAction(IAttackAction attackAction) {
		this.attackAction = attackAction;
	}
	
	public void setDefenceAction(IDefendAction defendAction) {
		this.defendAction = defendAction;
	}
	
	public void setRunAction(IRunAction runAction) {
		this.runAction = runAction;
	}
	
	public HeroRemaster() {
		this("David", 1, 0);
	}
	
	public HeroRemaster(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	protected void attack() {
		attackAction.attack();
	}
	
	protected void defend() {
		defendAction.defend();
	}
	
	protected void run() {
		runAction.run();
	}
}
