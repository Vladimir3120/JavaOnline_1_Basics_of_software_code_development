package by.jonline.task;

public class Task13 {

	// Task_cycle_02. Вычислить значение функции на отрезке [a,b] с шагом h:

	public static void main(String[] args) {

		double a, b, h, x, y;

		a = -9;
		b = 11;
		h = 0.5;
		x = 1;

		for (double i = a; i <= b; i += h) {

			if (x < a || x > b) {
				System.out.println("X не принадлеит [a,b]");
			}

			if (x > 2 && i >= x) {
				y = i;
				System.out.println(" x > 2: y = " + y);
			}

			if (x <= 2 && i >= x) {
				y = i * -1;
				System.out.println(" x <= 2: y = " + y);
			}
		}

	}

}
