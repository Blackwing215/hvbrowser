package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reference")
public class Reference {

	@Id
	@Column(name="idReference")
	private int idReference;
	
	@Column(name="name")
	private String name;
	
	@Column(name="path")
	private int path;

	public Reference() {
		super();
	}

	public Reference(int idReference, String name, int path) {
		super();
		this.idReference = idReference;
		this.name = name;
		this.path = path;
	}

	@Override
	public String toString() {
		return "Reference [idReference=" + idReference + ", name=" + name + ", path=" + path + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idReference;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + path;
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
		if (idReference != other.idReference)
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

	public int getIdReference() {
		return idReference;
	}

	public void setIdReference(int idReference) {
		this.idReference = idReference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}
}
