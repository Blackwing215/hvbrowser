package by.bsu.hvbrowser.db.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="filter")
public class Filter {

	@Id
	@Column(name="idFilter")
	private String id;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy = "filter", cascade = {CascadeType.ALL})
	private List<Variant> variants = new ArrayList<>();
	
	@ManyToMany(mappedBy="filters", cascade = {CascadeType.ALL})
	private List<Vcf> vcfFiles = new ArrayList<>();

	public Filter() {
		super();
	}

	public Filter(String idFilter, String description) {
		super();
		this.id = idFilter;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Filter [idFilter=" + id + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Filter other = (Filter) obj;
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
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String idFilter) {
		this.id = idFilter;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Variant> getVariants() {
		return variants;
	}

	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}
}
