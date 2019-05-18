package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;

@Entity
@Table(name="filter")
public class Filter {

	@Id
	@Column(name="idFilter")
	private String idFilter;
	
	@Column(name="description")
	private String description;

	public Filter() {
		super();
	}

	public Filter(String idFilter, String description) {
		super();
		this.idFilter = idFilter;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Filter [idFilter=" + idFilter + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idFilter == null) ? 0 : idFilter.hashCode());
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
		if (idFilter == null) {
			if (other.idFilter != null)
				return false;
		} else if (!idFilter.equals(other.idFilter))
			return false;
		return true;
	}

	public String getIdFilter() {
		return idFilter;
	}

	public void setIdFilter(String idFilter) {
		this.idFilter = idFilter;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
