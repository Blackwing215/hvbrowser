package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@Column(name = "idPatient")
	private int idPatient;
	
	@Column(name = "first_name", columnDefinition="varchar(45) null")
	private String firstName;

	@Column(name = "last_name", columnDefinition="varchar(45) null")
	private String lastName;
	
	@Column(name = "birthdate", columnDefinition="date null")
	private java.sql.Date birthdate;

	public Patient() {
		super();
	}
	
	public Patient(int id, String firstName, String lastName, java.sql.Date birthdate) {
		this();
		this.idPatient = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
	}
	
	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthdate=" + birthdate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + idPatient;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (idPatient != other.idPatient)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public java.sql.Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(java.sql.Date birthdate) {
		this.birthdate = birthdate;
	}
}
