package by.jonline.task;

public class Task19 {

	// Task_cycle_08. Даны два числа. Определить цифры, входящие в запись как
	// первого так и второго числа.

	public static void main(String[] args) {

		int x, y;
		String xS, yS;

		x = 153;
		y = 789;

		xS = Integer.toString(x);
		yS = Integer.toString(y);

		System.out.print("Числа входящие в состав X: ");
		for (int i = 0; i < xS.length(); i++) {
			x = xS.charAt(i) - '0';
			System.out.print(x);
		}

		System.out.println("");
		System.out.print("Числа входящие в состав Y: ");
		for (int i = 0; i < yS.length(); i++) {
			y = yS.charAt(i) - '0';
			System.out.print(y);

		}

	}

}
