package Lesson_1;

public class Task2 {

	public static void main(String[] args) {
		String str = "����� � ���������: ����� ��� ������!";
		System.out.println("���������� �������� = " + str.length());
		// ������ ������ �������� ������ str � ������ strInitialHalf
		String strInitialHalf = str.substring(0, str.length() / 2);
		// ������ ������ �������� ������ str � ������ strFinalHalf
		String strFinalHalf = str.substring(str.length() / 2, str.length());
		System.out.println(strInitialHalf);
		System.out.println(strFinalHalf);
	}

}
