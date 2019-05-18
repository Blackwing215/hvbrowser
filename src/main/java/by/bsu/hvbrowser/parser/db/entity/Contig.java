package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="contig")
public class Contig {

	@Id
	@Column(name="idContigs")
	private int idContig;
	
	@Column(name="length")
	private long length;
	
	@Column(name="assembly")
	private String assembly;
	
	@Column(name="md5")
	private String md5;
	
	@Column(name="species")
	private String species;
	
	@Column(name="taxonomy")
	private String taxonomy;

	public Contig() {
		super();
	}

	public Contig(int idContig, long length, String assembly, String md5, String species, String taxonomy) {
		super();
		this.idContig = idContig;
		this.length = length;
		this.assembly = assembly;
		this.md5 = md5;
		this.species = species;
		this.taxonomy = taxonomy;
	}

	@Override
	public String toString() {
		return "Contig [idContig=" + idContig + ", length=" + length + ", assembly=" + assembly + ", md5=" + md5
				+ ", species=" + species + ", taxonomy=" + taxonomy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((assembly == null) ? 0 : assembly.hashCode());
		result = prime * result + idContig;
		result = prime * result + (int) (length ^ (length >>> 32));
		result = prime * result + ((md5 == null) ? 0 : md5.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		result = prime * result + ((taxonomy == null) ? 0 : taxonomy.hashCode());
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
		Contig other = (Contig) obj;
		if (assembly == null) {
			if (other.assembly != null)
				return false;
		} else if (!assembly.equals(other.assembly))
			return false;
		if (idContig != other.idContig)
			return false;
		if (length != other.length)
			return false;
		if (md5 == null) {
			if (other.md5 != null)
				return false;
		} else if (!md5.equals(other.md5))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		if (taxonomy == null) {
			if (other.taxonomy != null)
				return false;
		} else if (!taxonomy.equals(other.taxonomy))
			return false;
		return true;
	}

	public int getIdContig() {
		return idContig;
	}

	public void setIdContig(int idContig) {
		this.idContig = idContig;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getTaxonomy() {
		return taxonomy;
	}

	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}
}
