package by.bsu.hvbrowser.db.entity;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="diagnosis")
public class Diagnosis {
	
	@Id
	@Column(name="idDiagnosis")
	private int id;
	
	@Column(name="diagnosis")
	private String diagnosis;

	@Column(name="description")
	private int description;
	
	@ManyToMany
	@JoinTable(
			name = "Diagnosis_has_Variant",
			joinColumns = @JoinColumn(name="idDiagnosis"),
			inverseJoinColumns = @JoinColumn(name="idVariant"))
	private Collection<Variant> variants;
	
	@OneToMany(mappedBy="diagnosis")
	private Collection<PatientHasDiagnosis> patientHasDiagnosis;
	
	public Diagnosis() {
		super();
	}

	public Diagnosis(int idDiagnosis, String diagnosis, int description) {
		super();
		this.id = idDiagnosis;
		this.diagnosis = diagnosis;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Diagnosis [idDiagnosis=" + id + ", diagnosis=" + diagnosis + ", description=" + description
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + description;
		result = prime * result + ((diagnosis == null) ? 0 : diagnosis.hashCode());
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}

	public int getIdDiagnosis() {
		return id;
	}

	public void setIdDiagnosis(int idDiagnosis) {
		this.id = idDiagnosis;
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
