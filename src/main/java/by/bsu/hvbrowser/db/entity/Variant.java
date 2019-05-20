package by.bsu.hvbrowser.db.entity;

import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name="variant")
public class Variant {
	
	@Id
	@Column(name="idVariant")
	private long id;
	
	@Column(name="chrom")
	private String chrom;
	
	@Column(name="position")
	private long position;
	
	@Column(name="dbsnp_id")
	private String dbsnpId;
	
	@Column(name="ref")
	private String ref;
	
	@Column(name="alt")
	private String alt;
	
	@Column(name="qual")
	private int qual;
	
	@ManyToOne
	@JoinColumn(name="idFILTER")
	private Filter filter;
	
	@ManyToMany
	@JoinTable(
			name = "Variant_has_FORMAT",
			joinColumns = @JoinColumn(name="idVariant"),
			inverseJoinColumns = @JoinColumn(name="idFORMAT"))
	private Collection<Format> formats;
	
	@ManyToMany
	@JoinTable(
			name = "Variant_has_INFO",
			joinColumns = @JoinColumn(name="idVariant"),
			inverseJoinColumns = @JoinColumn(name="idINFO"))
	private Collection<Info> info;
	
	@ManyToMany(mappedBy="variants")
	private Collection<Vcf> vcfFiles;
	
	@ManyToMany(mappedBy="variants")
	private Collection<Diagnosis> diagnosis;

	public Variant() {
		super();
	}

	public Variant(long idVariant, String chrom, long position, String dbsnpId, String ref, String alt, int qual,
			Filter filter) {
		super();
		this.id = idVariant;
		this.chrom = chrom;
		this.position = position;
		this.dbsnpId = dbsnpId;
		this.ref = ref;
		this.alt = alt;
		this.qual = qual;
		this.filter = filter;
	}

	@Override
	public String toString() {
		return "Variant [idVariant=" + id + ", chrom=" + chrom + ", position=" + position + ", dbsnpId="
				+ dbsnpId + ", ref=" + ref + ", alt=" + alt + ", qual=" + qual + ", filter=" + filter + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alt == null) ? 0 : alt.hashCode());
		result = prime * result + ((chrom == null) ? 0 : chrom.hashCode());
		result = prime * result + ((dbsnpId == null) ? 0 : dbsnpId.hashCode());
		result = prime * result + ((filter == null) ? 0 : filter.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (position ^ (position >>> 32));
		result = prime * result + qual;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
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
		Variant other = (Variant) obj;
		if (alt == null) {
			if (other.alt != null)
				return false;
		} else if (!alt.equals(other.alt))
			return false;
		if (chrom == null) {
			if (other.chrom != null)
				return false;
		} else if (!chrom.equals(other.chrom))
			return false;
		if (dbsnpId == null) {
			if (other.dbsnpId != null)
				return false;
		} else if (!dbsnpId.equals(other.dbsnpId))
			return false;
		if (filter == null) {
			if (other.filter != null)
				return false;
		} else if (!filter.equals(other.filter))
			return false;
		if (id != other.id)
			return false;
		if (position != other.position)
			return false;
		if (qual != other.qual)
			return false;
		if (ref == null) {
			if (other.ref != null)
				return false;
		} else if (!ref.equals(other.ref))
			return false;
		return true;
	}

	public long getIdVariant() {
		return id;
	}

	public void setIdVariant(long idVariant) {
		this.id = idVariant;
	}

	public String getChrom() {
		return chrom;
	}

	public void setChrom(String chrom) {
		this.chrom = chrom;
	}

	public long getPosition() {
		return position;
	}

	public void setPosition(long position) {
		this.position = position;
	}

	public String getDbsnpId() {
		return dbsnpId;
	}

	public void setDbsnpId(String dbsnpId) {
		this.dbsnpId = dbsnpId;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public int getQual() {
		return qual;
	}

	public void setQual(int qual) {
		this.qual = qual;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public Collection<Format> getFormats() {
		return formats;
	}

	public void setFormats(Collection<Format> formats) {
		this.formats = formats;
	}

	public Collection<Info> getInfo() {
		return info;
	}

	public void setInfo(Collection<Info> info) {
		this.info = info;
	}

	public Collection<Vcf> getVcfFiles() {
		return vcfFiles;
	}

	public void setVcfFiles(Collection<Vcf> vcfFiles) {
		this.vcfFiles = vcfFiles;
	}

	public Collection<Diagnosis> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Collection<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}
	
}
