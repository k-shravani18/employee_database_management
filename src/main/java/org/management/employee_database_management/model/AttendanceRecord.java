package org.management.employee_database_management.model;

import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
public class AttendanceRecord {
    private Employee employee;
    private Date date;
    private AttendanceType type;
    private BigDecimal hoursWorked;
    private boolean tardinessOrAbsence;
}
