package org.management.employee_database_management.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class EmergencyContact {
    private String name;
    private String address;
    private String workNumber;
    private String contactNumber;
    private String relationship;

}
