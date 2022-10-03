package volkan.hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import volkan.hrms.business.abstracts.JobTitleService;
import volkan.hrms.entities.concretes.JobTitle;
@RestController
@RequestMapping("/api/jobtitles")
public class JobTitleController {
	@Autowired
	private JobTitleService jobtitleservice;
	public JobTitleController(JobTitleService jobtitleservice) {
		super();
		this.jobtitleservice = jobtitleservice;
	}


	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		
		return this.jobtitleservice.getAll();
	}
	
	

}
