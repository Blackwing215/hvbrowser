package by.bsu.hvbrowser.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.bsu.hvbrowser.db.entity.Contig;

@Repository
public interface ContigRepository extends JpaRepository<Contig, String> {

}
