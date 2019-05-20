package by.bsu.hvbrowser.db.entity;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@Column(name = "idPatient")
	private int id;
	
	@Column(name = "first_name", columnDefinition="varchar(45) null")
	private String firstName;

	@Column(name = "last_name", columnDefinition="varchar(45) null")
	private String lastName;
	
	@Column(name = "birthdate", columnDefinition="date null")
	private java.sql.Date birthdate;
	
	@OneToMany(mappedBy = "patient")
	private Collection<Vcf> vcfFiles;
	
	@OneToMany(mappedBy="patient")
	private Collection<PatientHasDiagnosis> patientHasDiagnosis;
	
	public Patient() {
		super();
	}

	public Patient(int idPatient, String firstName, String lastName, Date birthdate, Collection<Vcf> vcfFiles,
			Collection<PatientHasDiagnosis> patientHasDiagnosis) {
		super();
		this.id = idPatient;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.vcfFiles = vcfFiles;
		this.patientHasDiagnosis = patientHasDiagnosis;
	}

	@Override
	public String toString() {
		return "Patient [idPatient=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthdate=" + birthdate + ", vcfFiles=" + vcfFiles + ", patientHasDiagnosis=" + patientHasDiagnosis
				+ "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((patientHasDiagnosis == null) ? 0 : patientHasDiagnosis.hashCode());
		result = prime * result + ((vcfFiles == null) ? 0 : vcfFiles.hashCode());
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
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (patientHasDiagnosis == null) {
			if (other.patientHasDiagnosis != null)
				return false;
		} else if (!patientHasDiagnosis.equals(other.patientHasDiagnosis))
			return false;
		if (vcfFiles == null) {
			if (other.vcfFiles != null)
				return false;
		} else if (!vcfFiles.equals(other.vcfFiles))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setIdPatient(int idPatient) {
		this.id = idPatient;
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

	public Collection<Vcf> getVcfFiles() {
		return vcfFiles;
	}

	public void setVcfFiles(Collection<Vcf> vcfFiles) {
		this.vcfFiles = vcfFiles;
	}

	public Collection<PatientHasDiagnosis> getPatientHasDiagnosis() {
		return patientHasDiagnosis;
	}

	public void setPatientHasDiagnosis(Collection<PatientHasDiagnosis> patientHasDiagnosis) {
		this.patientHasDiagnosis = patientHasDiagnosis;
	}
	
}
