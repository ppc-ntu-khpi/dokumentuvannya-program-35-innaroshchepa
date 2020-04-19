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
    public class Editor extends Artist{
    /**
     * Creates a new instance of the Editor class.
     * @param electronicEditing true if editor works on devices, false if on paper
     * @param skiils Skills of editor
     * @param name Editors name
     * @param jobTitle Editors name of a job
     * @param level Level of editor
     * @param dept Place where he works
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
     * Creates a new instance of the Editor class.
     * @param electronicEditing true if editor works on devices, false if on paper
     * @param skiils Skills of editor
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Creates a new instance of the Editor class that works with electronic devices.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
  /**
     * Returns all information about editor as string
     * @see Artist#toString()
     * @return string with information about editor
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }
    private boolean electronicEditing;

    public boolean getPreferences() {
        return electronicEditing;
    }

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}