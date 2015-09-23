package myModel;

import java.util.Arrays;

public class Patient extends Human {
	int[] illnesses;

	public void setIllnesses(String ills) {
		String[] temp = ills.split(",");
		int[] array = new int[temp.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf(temp[i]);
		}
		this.illnesses = array;
	}

	public int illsCount() {
		/* возвращает длину массива болезней */
		int count = 0;
		for (int i = 0; i < this.illnesses.length; i++)
			count++;
		return count;
	}

	public int[] getIlls() {
		return this.illnesses;
	}

	@Override
	public String toString() {
		return "Patient [illnesses=" + Arrays.toString(illnesses)
				+ ", getLastName()=" + getLastName() + ", getFirstName()="
				+ getFirstName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(illnesses);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (!Arrays.equals(illnesses, other.illnesses))
			return false;
		return true;
	}

}
