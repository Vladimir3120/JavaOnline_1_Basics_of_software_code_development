package by.jonline.task;

public class Task07 {

	// Task_branching_01. Даны два угла треугольника (в градусах). Определить,
	// существует ли такоц треугольник, и если да, то будет ли он прямоугольным.

	public static void main(String[] args) {

		int a, b;

		a = 40;
		b = 45;

		if (a == 90 || b == 90 || (a + b) == 90) {
			System.out.println("Треугольник прямоугольный");
		} else {
			System.out.println("Треугольник не прямоугольный");
		}

	}

}
