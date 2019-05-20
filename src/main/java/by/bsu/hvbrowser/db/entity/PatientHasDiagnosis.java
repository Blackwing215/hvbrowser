package by.bsu.hvbrowser.db.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Patient_has_Diagnosis")
public class PatientHasDiagnosis {

	@EmbeddedId
	private PatientDiagnosisEmbedded id;
	
	@ManyToOne
	@MapsId("idPatient")
	private Patient patient;

	@ManyToOne
	@MapsId("idDiagnosis")
	private Diagnosis diagnosis;
	
	@Column(name="start_date")
	private Date startDate;

	@Column(name="expiration_date")
	private Date expirationDate;
	
	public PatientHasDiagnosis() {
		super();
	}

	public PatientHasDiagnosis(PatientDiagnosisEmbedded id, Patient patient, Diagnosis diagnosis, Date startDate,
			Date expirationDate) {
		super();
		this.id = id;
		this.patient = patient;
		this.diagnosis = diagnosis;
		this.startDate = startDate;
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "PatientHasDiagnosis [id=" + id + ", patient=" + patient + ", diagnosis=" + diagnosis + ", startDate="
				+ startDate + ", expirationDate=" + expirationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diagnosis == null) ? 0 : diagnosis.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
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
		PatientHasDiagnosis other = (PatientHasDiagnosis) obj;
		if (diagnosis == null) {
			if (other.diagnosis != null)
				return false;
		} else if (!diagnosis.equals(other.diagnosis))
			return false;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	public PatientDiagnosisEmbedded getId() {
		return id;
	}

	public void setId(PatientDiagnosisEmbedded id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
}
