package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="format_fields")
public class FormatField {
	
	@Id
	@Column(name="idFormat_fields")
	private String idFormatField;

	@Column(name="number")
	private String number;

	@Column(name="type")
	private String type;

	@Column(name="description")
	private String description;

	public FormatField() {
		super();
	}

	public FormatField(String idFormatField, String number, String type, String description) {
		super();
		this.idFormatField = idFormatField;
		this.number = number;
		this.type = type;
		this.description = description;
	}

	@Override
	public String toString() {
		return "FormatField [idFormatField=" + idFormatField + ", number=" + number + ", type=" + type
				+ ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idFormatField == null) ? 0 : idFormatField.hashCode());
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
		FormatField other = (FormatField) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idFormatField == null) {
			if (other.idFormatField != null)
				return false;
		} else if (!idFormatField.equals(other.idFormatField))
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

	public String getIdFormatField() {
		return idFormatField;
	}

	public void setIdFormatField(String idFormatField) {
		this.idFormatField = idFormatField;
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
