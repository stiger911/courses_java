package main;

import java.util.Scanner;

import myModel.Doctor;
import myModel.Human;
import myModel.Patient;

public class Polyclinic {
	Scanner input = new Scanner(System.in);

	public void print(String message) {
		System.out.print(message);
	}

	public String readLine() {
		return input.nextLine();
	}

	public Human addData(Human human) {

		print("Пол (мужской/женский) : ");
		human.setGender(readLine().toLowerCase());

		print("Фамилия: ");
		human.setLastName(readLine());

		print("Имя: ");
		human.setFirstName(readLine());

		print("Возраст : ");
		human.setAge(Integer.valueOf(readLine()));

		if (human instanceof Doctor) {

			print("Специализации (не более 3. разделить - \",\").\n"
					+ "1 - голова, 2 - сердце, 3 - туловище, 4 - грудь, 5 - ноги): ");
			((Doctor) human).setSpecs(readLine());
		} else if (human instanceof Patient) {

			print("Болезни (не более 3. Разделить - \",\".\n"
					+ "1 - голова, 2 - сердце, 3 - туловище, 4 - грудь, 5 - ноги): ");
			((Patient) human).setIllnesses(readLine());
		}
		return human;
	}

	public void combine(Doctor[] doctors, Patient[] patients) {
		print("\n\n\n");
		for (Patient patient : patients) {
			String doctor = findDoctor(patient, doctors);
			String message = (doctor.length() == 0) ? "Нет врача необходимой специализации"
					: "Пациент " + pfio(patient) + " - Ваш доктор = " + doctor
							+ "\n";
			print(message);
		}

	}

	private static String findDoctor(Patient patient, Doctor[] docs) {
		String doctorsFIO = "";// Все врачи

		int[] illTemp = new int[patient.illsCount()];
		System.arraycopy(patient.getIlls(), 0, illTemp, 0, patient.illsCount());// копия
																				// массива
																				// болезней

		while (illTemp.length > 0)// повторять нахождения врачей, пока не
									// охватывает все заболевания

		{
			int elemMax = 0;// Врач, который охватывает максимум болезней
							// пациента.
			int max = 0; // максимальный охват
			for (int i = 0; i < docs.length; i++) {
				int count = 0; // Количество совпадений в болезнях и
								// специализаций
				for (int spec : docs[i].getSpecs()) {
					for (int illness : illTemp) {
						count = (illness == spec) ? ++count : count;// специальность
																	// совпадает
																	// с
																	// болезнью
					}
				}
				if (count > max) // этот врач имеет больше совпадений
				{
					elemMax = i;
					max = count;
				}
			}
			String comma;
			comma = (doctorsFIO.length() > 0) ? ", " : "";
			doctorsFIO += comma + dfio(docs[elemMax]);
			illTemp = cleanArray(illTemp, docs[elemMax].getSpecs());
		}
		return doctorsFIO;
	}

	private static int[] cleanArray(int[] illnesses, int[] specs) {
		/*
		 * сбрасывает все совпавшие болезни по спецификации и возвращается
		 * врачей изменение массива
		 */
		for (int i = 0; i < illnesses.length; i++)
			for (int spec : specs) {
				if (illnesses[i] == spec)
					illnesses[i] = 0;// эта болезнь совпадает. Мы не будем
										// проверять ее больше
			}
		int length = count(illnesses);

		int[] array = new int[length];
		int j = 0;
		for (int i = 0; i < illnesses.length; i++) {
			if (illnesses[i] != 0) {
				array[j] = illnesses[i];
				j++;
			}
		}
		return array;
	}

	private static int count(int[] array) {
		/* рассчитывает элементы, которые не равны нулю */
		int count = 0;
		for (int elem : array) {
			if (elem != 0) {
				count++;
			}
		}
		return count;
	}

	private static String dfio(Doctor doc) {
		return doc.getFirstName() + " " + doc.getLastName();
	}

	private static String pfio(Patient patient) {
		return patient.getFirstName() + " " + patient.getLastName();
	}

}
