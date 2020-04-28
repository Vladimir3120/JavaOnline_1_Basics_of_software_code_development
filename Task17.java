package by.jonline.task;

public class Task17 {

	// Task_cycle_06. Вывести на экран соответствий между символами и их численными
	// обозначениями в памяти компьютера.

	public static void main(String[] args) {

		for (int i = 33; i < 127; i++) {

			System.out.println(i + " - " + (char) i);
		}

	}

}
