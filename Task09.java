package by.jonline.task;

public class Task09 {

	// Task_branching_03. Даны три точки A(x1,y2), B(x2, y2), C(x3,y3). Определить,
	// будут ли они расположены на одной прямой.

	public static void main(String[] args) {

		int x1, x2, x3;
		int y1, y2, y3;

		x1 = 3;
		y1 = 2;

		x2 = 4;
		y2 = 3;

		x3 = 5;
		y3 = 4;

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("A, B, C - лежат на одной прямой");
		} else {
			System.out.println("A, B, C - не лежат на одной прямой");
		}
	}

}
