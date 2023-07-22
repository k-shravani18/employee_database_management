package org.management.employee_database_management.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Entity
public class PayRoll {
    @Id
    private Integer payRoleId;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    private BigDecimal deductions;
    private BigDecimal netSalary;
}
