package by.jonline.task;

public class Task11 {

	// Task_branching_05. Высичлить значение функции F(x) = x*x - 3x + 9, если x<=3
	// и F(x) = 1 / (x*x*x + 6), если x>3.

	public static void main(String[] args) {

		double x, f;
		x = 3.5;

		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("x <= 3: " + " F = " + f);
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.println("x > 3: " + " F = " + f);
		}

	}

}
