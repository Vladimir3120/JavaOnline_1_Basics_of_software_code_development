package by.jonline.task;

import java.util.Scanner;

public class Task18 {

	// Task_cycle_07. Для каждого натурального числа в промежутке от m до n вывести
	// все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
	public static void main(String[] args) {
		int m;
		int n;

		m = enterNum();
		n = enterNum();

		if (m > 0 && n > 0) {

			while (n > m) {

				for (double i = m + 1; i < n; i++) {

					double y = n % i;
					if (y == 0) {

						System.out.println("Делители: " + n + " = " + i);
					}
				}
				n--;
			}

		} else {
			System.out.println("Вы ввели некорректные данные");
		}

	}

	public static int enterNum() {
		int value;

		System.out.println("Введите натуральное число: >>");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите натуральное число: >>");
		}
		value = sc.nextInt();

		return value;

	}

}
