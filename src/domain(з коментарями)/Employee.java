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
public class Employee {

    /**
     * Returns all information about employee as string
     * @return string with information about employee
     */
   @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

 /**
     * Creates a new instance of the Employee class.
     * @param name Employee name
     * @param jobTitle Employee name of a job
     * @param level Level of employee
     * @param dept Place where he works
     */

    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
/**
     * Creates a new instance of the Employee class with empty fields (except ID).
     
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
/**
 * 
 * @param job 
 */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
/**
 * 
 * @return string of job name 
 */
    public String getJobTitle() {
        return jobTitle;
    }
/**
 * 
 * @return name
 */
    public String getName() {
        return name;
    }
/**
 * 
 * @param level of artist
 */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 * 
 * @return level of artist
 */
    public int getLevel() {
        return level;
    }
/**
 * 
 * @return place a work
 */
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
/**
 * if a name is fouls, name "John Doe" will be set instead.
 * @param name 
 */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
