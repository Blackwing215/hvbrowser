package by.bsu.hvbrowser.db.entity;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class PatientDiagnosisEmbedded implements Serializable {

	private static final long serialVersionUID = 7950216447253417868L;

	@Column(name="idPatient")
	private int idPatient;
	
	@Column(name="Diagnosis_idDiagnosis")
	private int idDiagnosis;

	public PatientDiagnosisEmbedded() {
		super();
	}

	public PatientDiagnosisEmbedded(int idPatient, int idDiagnosis) {
		super();
		this.idPatient = idPatient;
		this.idDiagnosis = idDiagnosis;
	}

	@Override
	public String toString() {
		return "PatientDiagnosisEmbedded [idPatient=" + idPatient + ", idDiagnosis=" + idDiagnosis + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDiagnosis;
		result = prime * result + idPatient;
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
		PatientDiagnosisEmbedded other = (PatientDiagnosisEmbedded) obj;
		if (idDiagnosis != other.idDiagnosis)
			return false;
		if (idPatient != other.idPatient)
			return false;
		return true;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public int getIdDiagnosis() {
		return idDiagnosis;
	}

	public void setIdDiagnosis(int idDiagnosis) {
		this.idDiagnosis = idDiagnosis;
	}
}
