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
public class Artist extends Employee{
    /**
     * Creates a new instance of the Artist class.
     * @param skiils Skills of artist
     * @param name Artists name
     * @param jobTitle Artists name of a job
     * @param level Level of artist
     * @param dept Place where he works
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
/**
     * Creates a new instance of the Artist class.
     * @param skiils Skills of artist
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
 /**
     * Returns all information about artist as string
     * @see Employee#toString()
     * @return string with information about artist
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
/**
     * Returns all artist skills in string
     * @return string with all skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/**
     * Sets skills of the artist 
     * @param skills Skills of the Artist
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    public String[] getSkillsLSist() {
        return skiils;
    }
}
