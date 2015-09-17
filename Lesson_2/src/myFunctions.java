import java.util.Scanner;

public class myFunctions {
	// ����� �������� �������
	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] arrayNumber = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < arrayNumber.length; i++) {
			arrayNumber[i] = sc.nextInt();
		}
		// ����� ������ ������ �� ����� �������
		myFunctions.displaysArrayElements(arrayNumber);
		return arrayNumber;
	}

	// ����� ������ ������� �� �����
	public static void displaysArrayElements(int[] arrayNumber) {
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.print(arrayNumber[i] + " | ");
			if (i == arrayNumber.length - 1)
				System.out.println();
		}
	}

	// ����� ���������� ���������
	public static int[] bubbleSort(int[] arrayNumber) {
		for (int i = arrayNumber.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arrayNumber[j] > arrayNumber[j + 1]) {
					int tmp = arrayNumber[j];
					arrayNumber[j] = arrayNumber[j + 1];
					arrayNumber[j + 1] = tmp;
				}
			}
		}
		// ����� ������ ������ �� ����� �������
		myFunctions.displaysArrayElements(arrayNumber);
		return arrayNumber;
	}

	// ���������� ������ ����� � ����� �� �� �����
	public static void searchEvenNumbers(int[] arrayNumber) {
		for (int i = 0; i < arrayNumber.length; i++) {
			if ((arrayNumber[i] % 2) == 0)
				System.out.print(arrayNumber[i] + " | ");
		}
	}
}
