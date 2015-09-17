public class Lesson_2 {

	public static void main(String[] args) {
		// вызов метода создание массива
		int[] arrayNumber = myFunctions.createArray();
		// вызов метода сортировки массива
		arrayNumber = myFunctions.bubbleSort(arrayNumber);
		// вызов метода поиска чётных чисел в массиве
		myFunctions.searchEvenNumbers(arrayNumber);
	}

}
