package by.jonline.task;

public class Task08 {

	// Task_branching_02. Найти max{min(a,b), min(c,d)}.

	public static void main(String[] args) {

		int a, b, c, d;
		int max;

		a = 5;
		b = 2;
		c = 7;
		d = 4;

		max = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println("max = " + max);

	}

}
