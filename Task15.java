package by.jonline.task;

public class Task15 {

	// Task_cycle_04. Составить программу нахождения произведения первых двухсот
	// чисел.

	public static final double MAX_VALUE = 1.7976931348623157E308;

	public static void main(String[] args) {

		double sum = 1;

		for (double i = 1; i <= 200; i++) {

			sum *= Math.pow(i, 2);

		}
		if (MAX_VALUE >= sum) {
			System.out.println("Произведение квадратов первых двухсот чисел: = " + sum);
		} else {
			System.out.println("Превышено максимальное значение double = " + MAX_VALUE);

		}
	}
}
