package by.bsu.hvbrowser.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.bsu.hvbrowser.db.entity.Reference;

@Repository
public interface ReferenceRepository extends JpaRepository<Reference, Integer> {

}
