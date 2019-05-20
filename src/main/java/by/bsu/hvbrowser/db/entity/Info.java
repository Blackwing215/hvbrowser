package by.bsu.hvbrowser.db.entity;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="info")
public class Info {

	@Id
	@Column(name="idInfo")
	private int id;

	@ManyToOne
	@JoinColumn(name="idINFO_fields")
	private InfoField infoField;

	@Column(name="value")
	private String value;

	@ManyToMany(mappedBy="info")
	private Collection<Variant> variants;
	
	public Info() {
		super();
	}

	public Info(int idInfo, InfoField infoField, String value, Collection<Variant> variants) {
		super();
		this.id = idInfo;
		this.infoField = infoField;
		this.value = value;
		this.variants = variants;
	}

	@Override
	public String toString() {
		return "Info [idInfo=" + id + ", infoField=" + infoField + ", value=" + value + ", variants=" + variants
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((infoField == null) ? 0 : infoField.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		result = prime * result + ((variants == null) ? 0 : variants.hashCode());
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
		if (id != other.id)
			return false;
		if (infoField == null) {
			if (other.infoField != null)
				return false;
		} else if (!infoField.equals(other.infoField))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		if (variants == null) {
			if (other.variants != null)
				return false;
		} else if (!variants.equals(other.variants))
			return false;
		return true;
	}

	public int getIdInfo() {
		return id;
	}

	public void setIdInfo(int idInfo) {
		this.id = idInfo;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public InfoField getInfoField() {
		return infoField;
	}

	public void setInfoField(InfoField infoField) {
		this.infoField = infoField;
	}

	public Collection<Variant> getVariants() {
		return variants;
	}

	public void setVariants(Collection<Variant> variants) {
		this.variants = variants;
	}
	
}
