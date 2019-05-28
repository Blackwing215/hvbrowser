package by.bsu.hvbrowser.db.entity;

import java.util.ArrayList;
import java.util.List;

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
	
	@ManyToOne(fetch=FetchType.LAZY, cascade = {CascadeType.ALL})
	@JoinColumn(name="idFILTER")
	private Filter filter;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "variant_has_format",
			joinColumns = @JoinColumn(name="idVariant"),
			inverseJoinColumns = @JoinColumn(name="idFORMAT"))
	private List<Format> formats = new ArrayList<>();
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
			name = "variant_has_info",
			joinColumns = @JoinColumn(name="idVariant"),
			inverseJoinColumns = @JoinColumn(name="idINFO"))
	private List<Info> info = new ArrayList<>();
	
	@ManyToMany(mappedBy="variants", cascade = {CascadeType.ALL})
	private List<Vcf> vcfFiles = new ArrayList<>();
	
	@ManyToMany(mappedBy="variants", cascade = {CascadeType.ALL})
	private List<Diagnosis> diagnosis = new ArrayList<>();

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

	public long getId() {
		return id;
	}

	public void setId(long idVariant) {
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

	public List<Format> getFormats() {
		return formats;
	}

	public void setFormats(List<Format> formats) {
		this.formats = formats;
	}

	public List<Info> getInfo() {
		return info;
	}

	public void setInfo(List<Info> info) {
		this.info = info;
	}

	public List<Vcf> getVcfFiles() {
		return vcfFiles;
	}

	public void setVcfFiles(List<Vcf> vcfFiles) {
		this.vcfFiles = vcfFiles;
	}

	public List<Diagnosis> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<Diagnosis> diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	public void addVcf(Vcf vcf) {
		this.vcfFiles.add(vcf);
	}
	
	public void removeVcf(Vcf vcf) {
		this.vcfFiles.remove(vcf);
	}
}
