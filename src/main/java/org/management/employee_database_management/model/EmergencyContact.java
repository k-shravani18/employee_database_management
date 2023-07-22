package org.management.employee_database_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EmergencyContact {
    @Id
    private Integer emergencyContactId;
    private String name;
    private String address;
    private String workNumber;
    private String contactNumber;
    private String relationship;

}
