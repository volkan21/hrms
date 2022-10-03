package volkan.hrms.business.abstracts;

import java.util.List;

import volkan.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();

}
