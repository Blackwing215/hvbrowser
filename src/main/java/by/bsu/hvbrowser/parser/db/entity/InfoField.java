package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="info_fields")
public class InfoField {
	
	@Id
	@Column(name="idInfo_fields")
	private String idInfoField;

	@Column(name="number")
	private String number;

	@Column(name="type")
	private String type;

	@Column(name="description")
	private String description;

	public InfoField() {
		super();
	}

	public InfoField(String idInfoField, String number, String type, String description) {
		super();
		this.idInfoField = idInfoField;
		this.number = number;
		this.type = type;
		this.description = description;
	}

	@Override
	public String toString() {
		return "InfoField [idInfoField=" + idInfoField + ", number=" + number + ", type=" + type + ", description="
				+ description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idInfoField == null) ? 0 : idInfoField.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		InfoField other = (InfoField) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idInfoField == null) {
			if (other.idInfoField != null)
				return false;
		} else if (!idInfoField.equals(other.idInfoField))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getIdInfoField() {
		return idInfoField;
	}

	public void setIdInfoField(String idInfoField) {
		this.idInfoField = idInfoField;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
