package volkan.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import volkan.hrms.business.abstracts.CandidateService;
import volkan.hrms.dataAccess.abstracts.CandidateDataAccess;
import volkan.hrms.entities.concretes.Candidates;
@Service
public class CandidatesManager implements CandidateService {
	@Autowired
	private CandidateDataAccess candidatedataaccess;
	public CandidatesManager(CandidateDataAccess candidatedataaccess) {
		super();
		this.candidatedataaccess = candidatedataaccess;
	}


	@Override
	public List<Candidates> getAll() {
		// TODO Auto-generated method stub
		return this.candidatedataaccess.findAll();
	}

}
