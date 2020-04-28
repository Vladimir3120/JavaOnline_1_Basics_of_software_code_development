package by.jonline.task;

public class Task03 {

	// Task_linear_03. Вычислить значение выражения по формуле (все переменные
	// принимают действительные значение):

	public static void main(String[] args) {

		double x, y, z;

		x = 22;
		y = -7.2;

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.println("Значение выражения Z: = " + z);
	}

}
