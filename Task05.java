package by.jonline.task;

public class Task05 {

	// Task_linear_05. Дано натуральное число T, которое представляет длительность
	// прошедшего времени в секундах. Вывести данное значение длительности в часах,
	// минутах, и секундах в следующей форме: ННч ММмин SSс.

	public static void main(String[] args) {

		int t, h, min, sec;

		t = 45678;

		h = t / 3600;
		min = (t - h * 3600) / 60;
		sec = (t - h * 3600) - min * 60;

		System.out.println("ННч ММмин SSс = " + h + "ч " + min + "мин " + sec + "сек");
	}

}
