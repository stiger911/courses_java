package Lesson_1;

public class Task1 {

	public static void main(String[] args) {
		float[] massNumber = new float[10];
		float average_value = 0;
		// ���� ��������� ��������� ����� ���� float, ��������� ������ � ������
		// � ����� ����� �� �����
		for (int i = 0; i < massNumber.length; i++) {
			massNumber[i] = (float) Math.random();
			System.out.print(massNumber[i] + " | ");
		}
		// ������������ ����� �������
		for (int i = 0; i < massNumber.length; i++) {
			average_value += massNumber[i];
		}
		average_value /= massNumber.length; // ���������� �������� ��������
		System.out.println("\naverage value = " + average_value);
	}
}
