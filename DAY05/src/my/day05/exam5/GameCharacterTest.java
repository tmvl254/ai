package my.day05.exam5;

import java.util.ArrayList;

public class GameCharacterTest {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		wizard.name = "간달프";
		wizard.hp = 2;
		wizard.mp = 50;
		//wizard.punch();
		//wizard.fireball();

		Knight knight = new Knight();
		knight.name = "킹아서";
		knight.hp = 2;
		knight.stamina = 50;
		//knight.punch();
		//knight.slash();		
		
		ArrayList<Novice> list = new ArrayList<Novice>();
		list.add(knight);
		list.add(wizard);
		
		for(Novice n: list) {
		if(n instanceof Knight) {
			((Knight)n).slash();
		}else if (n instanceof Wizard) {
			((Wizard)n).fireball();
		}
		}

	}

}

class Novice {
	String name;
	int hp;

	void punch() {
		System.out.printf("%s(HP:%d)의 펀치!\n", name, hp);
	}
}

class Wizard extends Novice {
	int mp;

	void fireball() {
		System.out.printf("%s(MP:%d)의 파이어볼!\n", name, mp);
	}

}

class Knight extends Novice {
	int stamina;

	void slash() {
		System.out.printf("%s(MP:%d)의 엑스칼리버!\n", name, stamina);
	}
}