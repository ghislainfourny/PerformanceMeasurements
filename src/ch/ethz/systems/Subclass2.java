package ch.ethz.systems;

public class Subclass2 extends Superclass {
	private int i;

	public Subclass2() {
	}

	@Override
	public void increment() {
		++i;
		++i;
	}

	public void increment2() {
		++i;
		++i;
		++i;
		++i;
	}

	public int get() {
		return i;
	}

	public boolean is2() {
		return true;
	}

	public int apply(int i) {
		return i - 1;
	}

	public int apply2(int i) {
		return i + 1;
	}

}
