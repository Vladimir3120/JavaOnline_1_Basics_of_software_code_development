package by.jonline.task;

public class Task04 {

	// Task_linear_04. Дано действительное число R вида nnn.ddd (три цифровых
	// разряда в дробной и целой частях). Поменять местами дробную и целую части и
	// вывести полученной значение числа.

	public static void main(String[] args) {

		double x, y;

		x = 123.654;

		y = (x * 1000) % 1000 + (int) x / 1000.0;

		System.out.println(y);

	}

}
