package volkan.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import volkan.hrms.entities.concretes.JobTitle;

public interface JobTitleDataAccess extends JpaRepository<JobTitle, Integer>{};
