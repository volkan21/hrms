package volkan.hrms.business.abstracts;

import java.util.List;

import volkan.hrms.entities.concretes.Candidates;

public interface CandidateService {
	List<Candidates> getAll();

}
