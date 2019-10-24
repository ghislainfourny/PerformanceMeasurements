package ch.ethz.systems;

public class InterfaceImpl2 implements Interface {
	private int i;

	public InterfaceImpl2() {
		i = 1;
	}

	public void increment() {
		++i;
	}

	public int get() {
		return i;
	}

	public boolean is1() {
		return false;
	}

	public boolean is2() {
		return true;
	}

	public int apply(int i) {
		return i - 1;
	}
}
