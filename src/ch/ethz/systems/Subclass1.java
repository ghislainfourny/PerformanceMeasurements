package ch.ethz.systems;

public class Subclass1 extends Superclass {
	private int i;

	public Subclass1() {
	}

	@Override
	public void increment() {
		++i;
	}

	public void increment1() {
		++i;
	}

	public int get() {
		return i;
	}

	public boolean is1() {
		return true;
	}

	public int apply(int i) {
		return i + 1;
	}

	public int apply1(int i) {
		return i + 1;
	}
}
