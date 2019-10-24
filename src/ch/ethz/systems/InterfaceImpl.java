package ch.ethz.systems;

public class InterfaceImpl implements Interface {
	private int i;

	public InterfaceImpl() {
		i = 0;
	}

	public void increment() {
		++i;
	}

	public int get() {
		return i;
	}

	public boolean is1() {
		return true;
	}

	public boolean is2() {
		return false;
	}

	public int apply(int i) {
		return i + 1;
	}
}
