package Lesson_1;

public class Task2 {

	public static void main(String[] args) {
		String str = "“анец с драконами: искры над пеплом!";
		System.out.println(" оличество символов = " + str.length());
		// запись первой половины строки str в строку strInitialHalf
		String strInitialHalf = str.substring(0, str.length() / 2);
		// запись второй половины строки str в строку strFinalHalf
		String strFinalHalf = str.substring(str.length() / 2, str.length());
		System.out.println(strInitialHalf);
		System.out.println(strFinalHalf);
	}

}
