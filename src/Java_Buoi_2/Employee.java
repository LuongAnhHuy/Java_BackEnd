package Java_Buoi_2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String numberID;

    List<Employee> employees = new ArrayList<>();


    public String getName() {
        return name;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public void inThongTin() {
        // System in
        System.out.println("------------------------");
        System.out.println("Name: " + getName());
        System.out.println("NumberID: " + getNumberID());
        System.out.println("------------------------");
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
