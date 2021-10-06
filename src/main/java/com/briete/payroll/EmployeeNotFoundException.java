package com.briete.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Could not found employee " + id);
    }
}
