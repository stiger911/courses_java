package myModel;

import java.util.Arrays;

public class Dentist extends Doctor {
private int dentist_Room;
	
	public int dentalTreatment(Patient patient){
		/*
		 * Стамотолог лечит зубы пациента
		 * Возвращает 0 не болеют зубы.
		 */
		
		return 0;
	}
	
	
	public int getDentist_Room() {
		return dentist_Room;
	}


	public void setDentist_Room(int operating_Room) {
		this.dentist_Room = operating_Room;
	}


	@Override
	public String toString() {
		return "Dantist [dentist_Room=" + dentist_Room + ", specs=" + Arrays.toString(getSpecs())
				+ ", getDentist_Room()=" + getDentist_Room() + ", getLastName()=" + getLastName()
				+ ", getFirstName()=" + getFirstName() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + dentist_Room;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentist other = (Dentist) obj;
		if (dentist_Room != other.dentist_Room)
			return false;
		return true;
	}

}
