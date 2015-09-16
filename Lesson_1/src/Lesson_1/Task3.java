package Lesson_1;
import static java.lang.Math.*;

public class Task3 {

	public static void main(String[] args) {
		int[] massNumber = new int[10];
		int maxNumber = Integer.MIN_VALUE; 
		int minNumber = Integer.MAX_VALUE;
		// массив случайных чисел
		for (int i = 0; i < massNumber.length; i++) {
			massNumber[i] = (int) (Math.random()*-30+15);
		}
		// нахождение максимального и минимального значения
		for (int i = 0; i < massNumber.length; i++) {
			minNumber = min(minNumber, massNumber[i]);
			maxNumber = max(maxNumber, massNumber[i]);
		}
		// вывод на экран максимальное и мимнимальное значение
		System.out.println("max value = " + maxNumber);
		System.out.println("min value = " + minNumber);
	}

}
