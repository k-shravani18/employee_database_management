package org.management.employee_database_management.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Location {
    private String city;
    private String state;
    private String country;
}
