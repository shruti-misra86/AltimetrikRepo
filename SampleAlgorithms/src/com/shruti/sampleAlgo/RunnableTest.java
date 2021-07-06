package com.shruti.sampleAlgo;

public class RunnableTest {

	@FunctionalInterface
	public interface Runnable {
		void run();
	}

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		java.lang.Runnable r2 = () -> { // lambda expression
			System.out.println("Runnable with Lambda Expression");
		};
		new Thread((java.lang.Runnable) r1).start();
		Thread t2 = new Thread((java.lang.Runnable) r2);
		t2.start();

	}
}