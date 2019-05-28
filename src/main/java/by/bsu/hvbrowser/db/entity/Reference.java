package by.bsu.hvbrowser.db.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;


@Entity
@Table(name="reference")
public class Reference {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idReference")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="path")
	private String path;
	
	@OneToMany(mappedBy = "reference", cascade = {CascadeType.ALL})
	private List<Vcf> vcfFiles = new ArrayList<>();

	public Reference() {
		super();
	}

	public Reference(int idReference, String name, String path) {
		super();
		this.id = idReference;
		this.name = name;
		this.path = path;
	}

	@Override
	public String toString() {
		return "Reference [idReference=" + id + ", name=" + name + ", path=" + path + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		Reference other = (Reference) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (path != other.path)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String string) {
		this.path = string;
	}

	public List<Vcf> getVcfFiles() {
		return vcfFiles;
	}

	public void setVcfFiles(List<Vcf> vcfFiles) {
		this.vcfFiles = vcfFiles;
	}
	
	public void addVcf(Vcf vcfFile) {
		this.vcfFiles.add(vcfFile);
	}
	
	public void removeVcf(Vcf vcfFile) {
		this.vcfFiles.remove(vcfFile);
	}
}
