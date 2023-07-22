package org.management.employee_database_management.service;

import org.management.employee_database_management.model.JobInformation;
import org.management.employee_database_management.repository.JobInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobInfoService {
    @Autowired
    private JobInfoRepository jobInfoRepository;

    public List<JobInformation> listAll() {
        return jobInfoRepository.findAll();
    }

    public void save(JobInformation jobInfo) {
        jobInfoRepository.save(jobInfo);
    }

    public JobInformation get(Long id) {
        return jobInfoRepository.findById(id).get();
    }
    public void delete(Long id){
        jobInfoRepository.deleteById(id);
    }
}
