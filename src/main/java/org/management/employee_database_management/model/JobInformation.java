package org.management.employee_database_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
@Data
@Entity
public class JobInformation {
    @Id
    private Integer jobInfoId;
    private String title;
    private String employeeID;
    private String department;
    private String supervisor;
    private String workLocation;
    private String jobEmailAddress;
    private String workNumber;
    private Date startDate;
    private BigDecimal salary;
    private Date dateOfJoining;
//    private EmergencyContact emergencyContact;
    private String healthConditions;
}
