package org.fd.ase.grp15.ase_contribute_service.repository;

import org.fd.ase.grp15.ase_contribute_service.entity.Contribution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContributeRepository extends JpaRepository<Contribution, Long> {
    List<Contribution> findAllByAuthor(String author);

    Contribution findContributionById(long id);

    List<Contribution> findAllByConferenceName(String conferenceName);

}
