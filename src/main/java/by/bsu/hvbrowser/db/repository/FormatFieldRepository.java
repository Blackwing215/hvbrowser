package by.bsu.hvbrowser.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.bsu.hvbrowser.db.entity.FormatField;

@Repository
public interface FormatFieldRepository extends JpaRepository<FormatField, String> {

}
