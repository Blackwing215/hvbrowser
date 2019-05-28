package by.bsu.hvbrowser.db.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="info")
public class Info {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idInfo")
	private long id;

	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="idINFO_fields")
	private InfoField infoField;

	@Column(name="value")
	private String value;

	@ManyToMany(mappedBy="info", cascade = {CascadeType.ALL})
	private List<Variant> variants = new ArrayList<>();
	
	public Info() {
		super();
	}

	public Info(int idInfo, InfoField infoField, String value, List<Variant> variants) {
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
		result = prime * result + (int) (id ^ (id >>> 32));
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

	public long getIdInfo() {
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

	public List<Variant> getVariants() {
		return variants;
	}

	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}
	
}
