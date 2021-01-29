package chapter9;

interface CanFly {
	void fly();
}

interface CanSwim {
	void swim();
}

interface CanClimb {
	void climb();
}

interface CanFight {
	void fight();
}

class ActionCharactor1 implements CanFly, CanSwim {
	public void fly() {
		System.out.println("ActionCharactor1.fly()");
	}

	public void swim() {
		System.out.println("ActionCharactor1.swim()");
	}
}

class ActionCharactor2 {
	public void fly() {
		System.out.println("ActionCharactor2.fly()");
	}
}

class Hero extends ActionCharactor1 implements CanSwim, CanFly, CanFight, CanClimb {

	@Override
	public void climb() {
		System.out.println("Hero.climb()");
	}

	@Override
	public void fight() {
		System.out.println("Hero.fight()");
	}
	
	@Override
	public void fly() {
		System.out.println("Hero.fly()");
	}
}

public class Practice3 {
	
	public static void main(String[] args) {
		Hero h = new Hero();
		fun1(h);
		fun2(h);
		fun3(h);
		fun4(h);
	}

	public static void fun1(CanSwim s) { s.swim(); }
	public static void fun2(CanFly f) { f.fly(); }
	public static void fun3(ActionCharactor1 a) { a.swim(); }
	public static void fun4(Hero h) { h.swim(); }
}
