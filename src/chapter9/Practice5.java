package chapter9;

interface Cycle {
	void fun();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void fun() {
		System.out.println("Unicycle.Cycle()");
	}
}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle {
	public void fun() {
		System.out.println("Bicycle.Cycle()");
	}
}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class Tricycle implements Cycle {
	public void fun() {
		System.out.println("Tricycle.Cycle()");
	}
}

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}

class Test {

	public static void main(String[] args) {
		System.out.println(new UnicycleFactory().getCycle());
		System.out.println(new BicycleFactory().getCycle());
		System.out.println(new TricycleFactory().getCycle());
	}

}
