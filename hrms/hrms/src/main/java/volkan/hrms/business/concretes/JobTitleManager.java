package volkan.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import volkan.hrms.business.abstracts.JobTitleService;
import volkan.hrms.dataAccess.abstracts.JobTitleDataAccess;
import volkan.hrms.entities.concretes.JobTitle;
@Service
public class JobTitleManager implements JobTitleService {
	@Autowired
	private JobTitleDataAccess jobtitledataaccess;
	public JobTitleManager(JobTitleDataAccess jobtitledataaccess) {
		super();
		this.jobtitledataaccess = jobtitledataaccess;
	}


	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobtitledataaccess.findAll();
	}

}
