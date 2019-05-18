package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="format")
public class Format {
	
	@Id
	@Column(name="idFormat")
	private int idFormat;

	@Column(name="idFormat_fields")
	private String idformatField;

	@Column(name="value")
	private String value;

	@Column(name="sample_name")
	private String sampleName;

	public Format() {
		super();
	}

	public Format(int idFormat, String idformatField, String value, String sampleName) {
		super();
		this.idFormat = idFormat;
		this.idformatField = idformatField;
		this.value = value;
		this.sampleName = sampleName;
	}

	@Override
	public String toString() {
		return "Format [idFormat=" + idFormat + ", idformatField=" + idformatField + ", value=" + value
				+ ", sampleName=" + sampleName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFormat;
		result = prime * result + ((idformatField == null) ? 0 : idformatField.hashCode());
		result = prime * result + ((sampleName == null) ? 0 : sampleName.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Format other = (Format) obj;
		if (idFormat != other.idFormat)
			return false;
		if (idformatField == null) {
			if (other.idformatField != null)
				return false;
		} else if (!idformatField.equals(other.idformatField))
			return false;
		if (sampleName == null) {
			if (other.sampleName != null)
				return false;
		} else if (!sampleName.equals(other.sampleName))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	public int getIdFormat() {
		return idFormat;
	}

	public void setIdFormat(int idFormat) {
		this.idFormat = idFormat;
	}

	public String getIdformatField() {
		return idformatField;
	}

	public void setIdformatField(String idformatField) {
		this.idformatField = idformatField;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
}
