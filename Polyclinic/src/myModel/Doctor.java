package myModel;

import java.util.Arrays;

public class Doctor extends Human {
	private int[] specs;// специализация

	public int[] getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		String[] temp = specs.split(",");
		int[] array = new int[temp.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf(temp[i]);
		}
		this.specs = array;
	}

	@Override
	public String toString() {
		return "Doctor [specs=" + Arrays.toString(specs) + ", getLastName()="
				+ getLastName() + ", getFirstName()=" + getFirstName()
				+ ", toString()=" + super.toString() + ", hashCode()="
				+ hashCode() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(specs);
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
		Doctor other = (Doctor) obj;
		if (!Arrays.equals(specs, other.specs))
			return false;
		return true;
	}

}
