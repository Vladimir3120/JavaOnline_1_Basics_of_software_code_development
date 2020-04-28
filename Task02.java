package by.jonline.task;

public class Task02 {

	// Task_linear_02. Вычислить значение выражения по формуле (все переменные
	// принимают действительные значение):

	public static void main(String[] args) {

		double a, b, c, z;

		a = 2;
		b = -3.4;
		c = 4.9;

		z = ((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

		System.out.println("Значение выражения Z: = " + z);
	}

}
