package by.bsu.hvbrowser.db.entity;

import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name="format")
public class Format {
	
	@Id
	@Column(name="idFormat")
	private int id;

	@ManyToOne
	@JoinColumn(name="idFormat_fields")
	private FormatField formatField;

	@Column(name="value")
	private String value;

	@Column(name="sample_name")
	private String sampleName;
	
	@ManyToMany(mappedBy="formats")
	private Collection<Variant> variants;

	public Format() {
		super();
	}

	public Format(int idFormat, FormatField formatField, String value, String sampleName,
			Collection<Variant> variants) {
		super();
		this.id = idFormat;
		this.formatField = formatField;
		this.value = value;
		this.sampleName = sampleName;
		this.variants = variants;
	}

	@Override
	public String toString() {
		return "Format [idFormat=" + id + ", formatField=" + formatField + ", value=" + value + ", sampleName="
				+ sampleName + ", variants=" + variants + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formatField == null) ? 0 : formatField.hashCode());
		result = prime * result + id;
		result = prime * result + ((sampleName == null) ? 0 : sampleName.hashCode());
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
		Format other = (Format) obj;
		if (formatField == null) {
			if (other.formatField != null)
				return false;
		} else if (!formatField.equals(other.formatField))
			return false;
		if (id != other.id)
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
		if (variants == null) {
			if (other.variants != null)
				return false;
		} else if (!variants.equals(other.variants))
			return false;
		return true;
	}

	public int getIdFormat() {
		return id;
	}

	public void setIdFormat(int idFormat) {
		this.id = idFormat;
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

	public FormatField getFormatField() {
		return formatField;
	}

	public void setFormatField(FormatField formatField) {
		this.formatField = formatField;
	}

	public Collection<Variant> getVariants() {
		return variants;
	}

	public void setVariants(Collection<Variant> variants) {
		this.variants = variants;
	}
}
