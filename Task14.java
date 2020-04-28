package by.jonline.task;

public class Task14 {

	// Task_cycle_03. Найти сумму квадратов первых ста чисел.

	public static final double MAX_VALUE = 1.7976931348623157E308;

	public static void main(String[] args) {

		double sum = 1;
		int count = 0;

		while (count < 100) {

			sum += Math.pow(count, 2);

			count++;
		}

		if (MAX_VALUE >= sum) {
			System.out.println("Сумма квадратов первых ста чисел: = " + sum);
		} else {
			System.out.println("Превышено максимальное значение double = " + MAX_VALUE);

		}
	}
}
