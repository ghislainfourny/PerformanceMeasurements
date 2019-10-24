package ch.ethz.systems;

public class Standalone {
	private int i;

	public Standalone() {
		i = 0;
	}

	public void increment() {
		++i;
	}

	public int get() {
		return i;
	}

	public int addOne(int i) {
		return i + 1;
	}

	public int removeOne(int i) {
		return i - 1;
	}
}
