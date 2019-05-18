package by.bsu.hvbrowser.parser.db.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="vcf")
public class Vcf {

	@Id
	@Column(name="idVCF")
	private String idVCF;
	
	@Column(name="Patient_idPatient")
	private int idPatient;
	
	@Column(name="header")
	private String header;
	
	@Column(name="file_format")
	private String fileFormat;
	
	@Column(name="file_date")
	private Date fileDate;
	
	@Column(name="Reference_idReference")
	private String idReference;
	
	public Vcf() {
		super();
	}
	
	public Vcf(String idVCF, int idPatient, String header, String fileFormat, Date fileDate, String idReference) {
		super();
		this.idVCF = idVCF;
		this.idPatient = idPatient;
		this.header = header;
		this.fileFormat = fileFormat;
		this.fileDate = fileDate;
		this.idReference = idReference;
	}
	
	@Override
	public String toString() {
		return "Vcf [idVCF=" + idVCF + ", idPatient=" + idPatient + ", header=" + header + ", fileFormat=" + fileFormat
				+ ", fileDate=" + fileDate + ", idReference=" + idReference + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileDate == null) ? 0 : fileDate.hashCode());
		result = prime * result + ((fileFormat == null) ? 0 : fileFormat.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + idPatient;
		result = prime * result + ((idReference == null) ? 0 : idReference.hashCode());
		result = prime * result + ((idVCF == null) ? 0 : idVCF.hashCode());
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
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (idPatient != other.idPatient)
			return false;
		if (idReference == null) {
			if (other.idReference != null)
				return false;
		} else if (!idReference.equals(other.idReference))
			return false;
		if (idVCF == null) {
			if (other.idVCF != null)
				return false;
		} else if (!idVCF.equals(other.idVCF))
			return false;
		return true;
	}

	public String getIdVCF() {
		return idVCF;
	}

	public void setIdVCF(String idVCF) {
		this.idVCF = idVCF;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
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

	public String getIdReference() {
		return idReference;
	}

	public void setIdReference(String idReference) {
		this.idReference = idReference;
	}	
}
