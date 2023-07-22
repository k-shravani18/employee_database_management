package org.management.employee_database_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Location {
    @Id
    private Integer locationId;
    private String city;
    private String state;
    private String country;
}
