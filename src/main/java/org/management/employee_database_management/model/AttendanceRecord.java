package org.management.employee_database_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
public class AttendanceRecord {
    @Id
    private Integer attendanceId;
//    private Employee employee;
    private Date date;
    private AttendanceType type;
    private BigDecimal hoursWorked;
    private boolean tardinessOrAbsence;
}
