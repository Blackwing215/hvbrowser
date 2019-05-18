package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="info")
public class Info {

	@Id
	@Column(name="idInfo")
	private int idInfo;

	@Column(name="idINFO_fields")
	private String idInfoField;

	@Column(name="value")
	private String value;

	public Info() {
		super();
	}

	public Info(int idInfo, String idInfoFields, String value) {
		super();
		this.idInfo = idInfo;
		this.idInfoField = idInfoFields;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Info [idInfo=" + idInfo + ", idInfoFields=" + idInfoField + ", value=" + value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idInfo;
		result = prime * result + ((idInfoField == null) ? 0 : idInfoField.hashCode());
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
		Info other = (Info) obj;
		if (idInfo != other.idInfo)
			return false;
		if (idInfoField == null) {
			if (other.idInfoField != null)
				return false;
		} else if (!idInfoField.equals(other.idInfoField))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	public int getIdInfo() {
		return idInfo;
	}

	public void setIdInfo(int idInfo) {
		this.idInfo = idInfo;
	}

	public String getIdInfoFields() {
		return idInfoField;
	}

	public void setIdInfoFields(String idInfoFields) {
		this.idInfoField = idInfoFields;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
