package org.management.employee_database_management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String name;
    private String address;
    private String phoneNumber;
    private String mobileNumber;
    private String emailAddress;
    private String aadhaarOrGovernmentID;
    private String PAN;
    private Date birthDate;
    private String specialInterests;
//    private List<String> learningInstitutions;
    private String maritalStatus;
    private String spouseName;
    private String spouseEmployer;


//    public void sendConfirmationEmailToManager() {
//        // Logic to send email
//    }
}
