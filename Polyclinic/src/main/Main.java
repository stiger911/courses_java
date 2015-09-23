package main;

import myModel.Doctor;
import myModel.Patient;

public class Main {

public static void main(String[] args) {
		
		
		int num = 0;
		Polyclinic man = new Polyclinic();
		
		man.print("Сколько врачей добавить? ");
		num = Integer.valueOf(man.readLine());
		Doctor[] doctors = new Doctor[num];//Массив врачей в больнице (не более 6)
		
		man.print("Сколько пациентов добавить? ");
		num = Integer.valueOf(man.readLine());
		Patient[] patients = new Patient[num];//Массив пациентов (не более 15)
		
		
		man.print("\nДобавление врачей: \n");
		for (int i = 0; i < doctors.length; i++)
		{
			doctors[i] = new Doctor();
			man.addData(doctors[i]);//заполнение всех атрибутов созданного доктора  данными
		}
	
		man.print("\nДобавление пациентов: \n");
		for (int i = 0; i < patients.length; i++)
		{
			patients[i] = new Patient();
			man.addData(patients[i]);//заполнение всех атрибутов созданного пациента  данными
		}
		
		//Печать посещения больных
		man.combine(doctors,patients);
		
		for (int i = 0; i < doctors.length; i++){
			System.out.println(doctors[i].toString());
			System.out.println(doctors[i].hashCode());
		}
		for (int i = 0; i < patients.length; i++){
			System.out.println(patients[i].toString());
			System.out.println(patients[i].hashCode());
		}
	}

}
