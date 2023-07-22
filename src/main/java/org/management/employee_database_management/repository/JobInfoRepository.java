package org.management.employee_database_management.repository;

import org.management.employee_database_management.model.JobInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobInfoRepository extends JpaRepository<JobInformation, Long> {
}
