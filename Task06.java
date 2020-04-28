package by.jonline.task;

public class Task06 {

	// Task_branching_00. Для данной области составить линейную программу, которая
	// печатает true, если точка с координатами (x,y) принадлежит закрашенной
	// области, и false - в противном случае.

	public static void main(String[] args) {

		int x, y;

		x = 3;
		y = 5;

		if (x >= -2 && x <= 2 && y <= 4 && y >= 0) {
			System.out.println("true");
		} else if (x >= -4 && x <= 4 && y >= -4 && y <= 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
