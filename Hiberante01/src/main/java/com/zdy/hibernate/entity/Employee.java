package com.zdy.hibernate.entity;

import com.zdy.hibernate.entity.Department;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "fistname")
    private String firstName;
    @Column(name = "salary")
    private double salary;
    @JoinColumn(name = "department")
    @ManyToOne
    private Department department;
    //默认构造方法
    public Employee() {
    }
    //getter 和 setter 方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n id=" + id +
                ",\n firstName='" + firstName + '\'' +
                ", \nsalary=" + salary +
                ", \ndepartment=" + department +
                '}';
    }
}
