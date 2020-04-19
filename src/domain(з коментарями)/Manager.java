/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Инна
 */
public class Manager extends Employee {
    /**
     * Creates a new instance of the Manager class.
     * @param employees List of assigned to him employees
     * @param name Managers name
     * @param jobTitle Managers name of a job
     * @param level Level of manager
     * @param dept Place where he works
     */
     public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
/**
 * 
 * @param employees 
 */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
/**
 * All employees name in one string
 * @return All employees name
 */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
/**
     * Get list of employees assigned to this manager
     * @return list of assigned employees
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

}
