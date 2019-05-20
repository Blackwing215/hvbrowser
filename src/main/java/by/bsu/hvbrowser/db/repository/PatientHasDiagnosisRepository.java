package by.bsu.hvbrowser.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.bsu.hvbrowser.db.entity.PatientDiagnosisEmbedded;
import by.bsu.hvbrowser.db.entity.PatientHasDiagnosis;

@Repository
public interface PatientHasDiagnosisRepository extends JpaRepository<PatientHasDiagnosis, PatientDiagnosisEmbedded> {

}
