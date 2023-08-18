package com.mjc.stage2;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Employee {
    private String name;
    private String lastName;
    private String position;
    private String phone;
    private String email;
    private String carNumber;

    public Employee() {
        // nothing to do here.
    }


    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private final Employee employee;
        public EmployeeBuilder(){
            employee = new Employee();
        }

        public EmployeeBuilder setName(String name){
            this.employee.name = name;
            return this;
        }

        public EmployeeBuilder setLastName(String lastName){
            this.employee.lastName = lastName;
            return this;
        }

        public EmployeeBuilder setPosition(String position){
            this.employee.position = position;
            return this;
        }

        public EmployeeBuilder setPhone(String phone){
            this.employee.phone = phone;
            return this;
        }

        public EmployeeBuilder setEmail(String email){
            this.employee.email = email;
            return this;
        }

        public EmployeeBuilder setCarNumber(String carNumber){
            this.employee.carNumber = carNumber;
            return this;
        }

        public Employee build(){
            return employee;
        }

    }

    public static void main(String[] args) {
        Employee employee = Employee.getBuilder()
                .setName("Anna")
                .setLastName("Smith")
                .setPosition("Software Engineer")
                .setPhone("+1 305 789 1267")
                .setEmail("lala@gmail.com")
                .setCarNumber("56-787")
                .build();
        log.info("Employee: " + employee.getName() + " " + employee.getLastName());
    }
}
