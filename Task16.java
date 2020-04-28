package by.jonline.task;

public class Task16 {

	// Task_cycle_05. Даны числовой ряд и некоторое число е. Найти сумму тех членов
	// ряда, модуль которых больше или равен заданному е.

	public static void main(String[] args) {

		double e;
		double an;
		double sum = 0;

		e = 0.1;

		for (int i = 0; i < 10; i++) {

			an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(an) >= e) {
				sum += an;

			}
		}
		System.out.println("Сумма членов ряда, модуль которых больше или равен заданному е: = " + sum);
	}

}
