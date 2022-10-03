package volkan.hrms.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import volkan.hrms.business.concretes.CandidatesManager;
import volkan.hrms.entities.concretes.Candidates;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	@Autowired
	private CandidatesManager candidatesmanager;

	
	
	
	@GetMapping("/getall")
	public List<Candidates> getAll(){
	return this.candidatesmanager.getAll();
	}

}


	


