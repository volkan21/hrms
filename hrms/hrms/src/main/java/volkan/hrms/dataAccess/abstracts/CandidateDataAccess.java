package volkan.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import volkan.hrms.entities.concretes.Candidates;

public interface CandidateDataAccess extends JpaRepository<Candidates, Integer> {

}
