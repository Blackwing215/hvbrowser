package by.bsu.hvbrowser.db.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="vcf")
public class Vcf {

	@Id
	@Column(name="idVCF")
	private String id;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="Patient_idPatient")
	private Patient patient;
	
	@Column(name="header")
	private String header;
	
	@Column(name="file_format")
	private String fileFormat;
	
	@Column(name="file_date")
	private Date fileDate;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="Reference_idReference")
	private Reference reference;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "vcf_has_filter",
			joinColumns = @JoinColumn(name="idVCF"),
			inverseJoinColumns = @JoinColumn(name="idFILTER"))
	private List<Filter> filters = new ArrayList<>();
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "vcf_has_contigs",
			joinColumns = @JoinColumn(name="idVCF"),
			inverseJoinColumns = @JoinColumn(name="idContigs"))
	private List<Contig> contigs = new ArrayList<>();
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "vcf_has_info_fields",
			joinColumns = @JoinColumn(name="idVCF"),
			inverseJoinColumns = @JoinColumn(name="idINFO_fields"))
	private List<InfoField> infoFields = new ArrayList<>();
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "vcf_has_format_fields",
			joinColumns = @JoinColumn(name="idVCF"),
			inverseJoinColumns = @JoinColumn(name="idFORMAT_fields"))
	private List<FormatField> formatFields = new ArrayList<>();
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "vcf_has_variant",
			joinColumns = @JoinColumn(name="idVCF"),
			inverseJoinColumns = @JoinColumn(name="idVariant"))
	private List<Variant> variants = new ArrayList<>();
	
	public Vcf() {
		super();
	}
	
	public Vcf(String idVCF, Patient patient, String header, String fileFormat, Date fileDate, Reference reference,
			List<Filter> filters, List<Contig> contigs, List<InfoField> infoFields,
			List<FormatField> formatFields, List<Variant> variants) {
		super();
		this.id = idVCF;
		this.patient = patient;
		this.header = header;
		this.fileFormat = fileFormat;
		this.fileDate = fileDate;
		this.reference = reference;
		this.filters = filters;
		this.contigs = contigs;
		this.infoFields = infoFields;
		this.formatFields = formatFields;
		this.variants = variants;
	}

	@Override
	public String toString() {
		return "Vcf [idVCF=" + id + ", patient=" + patient + ", header=" + header + ", fileFormat=" + fileFormat
				+ ", fileDate=" + fileDate + ", reference=" + reference + ", filters=" + filters + ", contigs="
				+ contigs + ", infoFields=" + infoFields + ", formatFields=" + formatFields + ", variants=" + variants
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contigs == null) ? 0 : contigs.hashCode());
		result = prime * result + ((fileDate == null) ? 0 : fileDate.hashCode());
		result = prime * result + ((fileFormat == null) ? 0 : fileFormat.hashCode());
		result = prime * result + ((filters == null) ? 0 : filters.hashCode());
		result = prime * result + ((formatFields == null) ? 0 : formatFields.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((infoFields == null) ? 0 : infoFields.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + ((reference == null) ? 0 : reference.hashCode());
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
		Vcf other = (Vcf) obj;
		if (contigs == null) {
			if (other.contigs != null)
				return false;
		} else if (!contigs.equals(other.contigs))
			return false;
		if (fileDate == null) {
			if (other.fileDate != null)
				return false;
		} else if (!fileDate.equals(other.fileDate))
			return false;
		if (fileFormat == null) {
			if (other.fileFormat != null)
				return false;
		} else if (!fileFormat.equals(other.fileFormat))
			return false;
		if (filters == null) {
			if (other.filters != null)
				return false;
		} else if (!filters.equals(other.filters))
			return false;
		if (formatFields == null) {
			if (other.formatFields != null)
				return false;
		} else if (!formatFields.equals(other.formatFields))
			return false;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (infoFields == null) {
			if (other.infoFields != null)
				return false;
		} else if (!infoFields.equals(other.infoFields))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (reference == null) {
			if (other.reference != null)
				return false;
		} else if (!reference.equals(other.reference))
			return false;
		if (variants == null) {
			if (other.variants != null)
				return false;
		} else if (!variants.equals(other.variants))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setIdVCF(String idVCF) {
		this.id = idVCF;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public Date getFileDate() {
		return fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public Reference getReference() {
		return reference;
	}

	public void setReference(Reference reference) {
		this.reference = reference;
	}

	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public List<Contig> getContigs() {
		return contigs;
	}

	public void setContigs(List<Contig> contigs) {
		this.contigs = contigs;
	}

	public List<InfoField> getInfoFields() {
		return infoFields;
	}

	public void setInfoFields(List<InfoField> infoFields) {
		this.infoFields = infoFields;
	}

	public List<FormatField> getFormatFields() {
		return formatFields;
	}

	public void setFormatFields(List<FormatField> formatFields) {
		this.formatFields = formatFields;
	}

	public List<Variant> getVariants() {
		return variants;
	}

	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}
	
	public void addInfoField(InfoField infoField) {
		this.infoFields.add(infoField);
	}
	
	public void removeInfoField(InfoField infoField) {
		this.infoFields.remove(infoField);
	}
	
	public void addFormatField(FormatField formatField) {
		this.formatFields.add(formatField);
	}
	
	public void removeFormatField(FormatField formatField) {
		this.formatFields.remove(formatField);
	}
	
	public void addFilter(Filter filter) {
		this.filters.add(filter);
	}
	
	public void removeFilter(Filter filter) {
		this.filters.remove(filter);
	}
	
	public void addContig(Contig contig) {
		this.contigs.add(contig);
	}
	
	public void removeContig(Contig contig) {
		this.contigs.remove(contig);
	}
	
	public void addVariant(Variant variant) {
		this.variants.add(variant);
	}
	
	public void removeVariant(Variant variant) {
		this.variants.remove(variant);
	}
}
