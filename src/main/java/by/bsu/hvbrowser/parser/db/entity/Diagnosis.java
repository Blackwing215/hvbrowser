package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="diagnosis")
public class Diagnosis {
	
	@Id
	@Column(name="idDiagnosis")
	private int idDiagnosis;
	
	@Column(name="diagnosis")
	private String diagnosis;

	@Column(name="description")
	private int description;
	
	public Diagnosis() {
		super();
	}

	public Diagnosis(int idDiagnosis, String diagnosis, int description) {
		super();
		this.idDiagnosis = idDiagnosis;
		this.diagnosis = diagnosis;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Diagnosis [idDiagnosis=" + idDiagnosis + ", diagnosis=" + diagnosis + ", description=" + description
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + description;
		result = prime * result + ((diagnosis == null) ? 0 : diagnosis.hashCode());
		result = prime * result + idDiagnosis;
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
		Diagnosis other = (Diagnosis) obj;
		if (description != other.description)
			return false;
		if (diagnosis == null) {
			if (other.diagnosis != null)
				return false;
		} else if (!diagnosis.equals(other.diagnosis))
			return false;
		if (idDiagnosis != other.idDiagnosis)
			return false;
		return true;
	}

	public int getIdDiagnosis() {
		return idDiagnosis;
	}

	public void setIdDiagnosis(int idDiagnosis) {
		this.idDiagnosis = idDiagnosis;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public int getDescription() {
		return description;
	}

	public void setDescription(int description) {
		this.description = description;
	}
	
	
}
