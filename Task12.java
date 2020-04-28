package by.jonline.task;

import java.util.Scanner;

public class Task12 {

	// Task_cycle_01. Напишите программу, где польщователь вводит любое целое
	// положительное число. А программа суммирует все числа от 1 до введенного
	// пользователем числа.

	public static void main(String[] args) {
		int x;

		x = enterNum();

	}

	public static int enterNum() {
		int x;

		System.out.println("Введите целое положительное число: >>");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите целое положительное число: >>");
		}

		x = sc.nextInt();

		if (x > 0) {
			int count = 1;
			int sum = 0;
			while (count <= x) {

				sum += count;

				count++;

			}
			System.out.println("Сумма всеч чисел от 1 до введенного пользователем числа: =" + sum);
		} else {
			System.out.println("Вы ввели отрицательное число либо 0");
		}

		return x;
	}

}
