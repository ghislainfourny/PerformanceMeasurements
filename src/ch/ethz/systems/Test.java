package ch.ethz.systems;

public class Test {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Standalone[] s = new Standalone[20000000];
		for (int i = 0; i < 20000000; ++i) {
			s[i] = new Standalone();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Construction Standalone: " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		Superclass[] su = new Superclass[20000000];
		for (int i = 0; i < 20000000; ++i) {
			if (i % 2 == 0) {
				su[i] = new Subclass1();
			} else {
				su[i] = new Subclass2();
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Construction Superclass: " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		int[] ints = new int[20000000];
		for (int i = 0; i < 20000000; ++i) {
			if (i % 2 == 0) {
				ints[i] = 1;
			} else {
				ints[i] = 2;
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Construction ints: " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		Interface[] si = new Interface[20000000];
		for (int i = 0; i < 20000000; ++i) {
			if (i % 2 == 0) {
				si[i] = new InterfaceImpl();
			} else {
				si[i] = new InterfaceImpl2();
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Construction Interface: " + (endTime - startTime));

		System.out.println();
		
		int counter = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			counter = su[i].apply(counter);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Dispatch subclass: " + (endTime - startTime));

		counter = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			if (su[i] instanceof Subclass1) {
				counter = ((Subclass1) su[i]).apply1(counter);
			} else if (su[i] instanceof Subclass2) {
				counter = ((Subclass2) su[i]).apply2(counter);
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Cast: " + (endTime - startTime));

		counter = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			if (su[i] instanceof Subclass1) {
				++counter;
			} else if (su[i] instanceof Subclass2) {
				--counter;
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Instanceof and direct: " + (endTime - startTime));


		
		
		counter = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			if (su[i].is1()) {
				++counter;
			} else if (su[i].is2()) {
				--counter;
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Is with superclass and direct: " + (endTime - startTime));

		counter = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			counter = si[i].apply(counter);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Dispatch interface: " + (endTime - startTime));
		counter = 0;
		
		counter = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			if (si[i].is1()) {
				++counter;
			} else if (si[i].is2()) {
				--counter;
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Is with interface and direct: " + (endTime - startTime));


		counter = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			switch (ints[i]) {
			case 1:
				counter = s[i].addOne(counter);
			case 2:
				counter = s[i].removeOne(counter);
			default:
				;
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("switch and standalone method: " + (endTime - startTime));

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000000; ++i) {
			switch (ints[i]) {
			case 1:
				++counter;
			case 2:
				--counter;
			default:
				;
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("Switch and direct: " + (endTime - startTime));
	}

}
