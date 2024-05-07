package rpg;

public class RoleGameTest {

	public static void main(String[] args) {	
		ISwordMan saber = new ISwordMan("亞拉岡", 1, 0);
		IArrowMan archer = new IArrowMan("勒苟拉斯", 1, 0);
		
		saber.setAttackAction(new AttackSlash());
		saber.setRunAction(new Run());
		
		archer.setAttackAction(new AttackArrow());
		archer.setRunAction(new Run());
		
		saber.attack();
		saber.run();
		archer.attack();
		archer.run();
		
	}

}
