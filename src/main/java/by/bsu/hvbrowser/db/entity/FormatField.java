package by.bsu.hvbrowser.db.entity;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="format_fields")
public class FormatField {
	
	@Id
	@Column(name="idFormat_fields")
	private String id;

	@Column(name="number")
	private String number;

	@Column(name="type")
	private String type;

	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy="formatField")
	private Collection<Format> formats;
	
	@ManyToMany(mappedBy="formatFields")
	private Collection<Vcf> vcfFiles;

	public FormatField() {
		super();
	}

	public FormatField(String idFormatField, String number, String type, String description) {
		super();
		this.id = idFormatField;
		this.number = number;
		this.type = type;
		this.description = description;
	}

	@Override
	public String toString() {
		return "FormatField [idFormatField=" + id + ", number=" + number + ", type=" + type
				+ ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return id;
	}

	public void setIdFormatField(String idFormatField) {
		this.id = idFormatField;
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
