package by.jonline.task;

public class Task10 {
	// Task_branching_04. Заданы размеры A,B прямоугольного отверстия и размеры
	// x,y,z кирпича. Определить, пройдет ли кирпич через отверстие

	public static void main(String[] args) {

		int a, b;
		int x, y, z;

		a = 5;
		b = 7;

		x = 3;
		y = 10;
		z = 6;

		if (a > x && b > y || b > x && a > y) {
			System.out.println("Проходит");
		} else if (a > x && b > z || b > x && z > z) {
			System.out.println("Проходит");
		} else if (a > y && b > z || b > y && a > z) {
			System.out.println("Проходит");
		} else {
			System.out.println("Не проходит");
		}
	}
}
