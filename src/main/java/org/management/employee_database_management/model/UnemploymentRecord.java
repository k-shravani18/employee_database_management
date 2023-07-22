package org.management.employee_database_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class UnemploymentRecord {
    @Id
    private Integer unemploymentRecordId;
//    private Employee employee;
    private String name;
    private String address;
    private String socialSecurityNumber;
    private Date hireDate;
    private Date separationDate;
    private Date rehireDate;
//    private List<Date> paymentDates;
//    private List<Date> datesWorked;
    private BigDecimal hoursWorked;

}
