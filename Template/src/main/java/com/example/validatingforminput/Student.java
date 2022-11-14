package com.example.validatingforminput;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

public class Student {
    //TODO: add Spring annotations to variables we want to validate

    //INITIALISE VARIABLES
    private Integer id;
    private Integer PCN;
    private String firstName;
    private String lastName;
    private Specialisation specialisation;


    //HELPER FUNCTIONS
    /**
     * This method is used to change specialisation from software engineering. If the user is currently software
     * engineering, it'll switch and return "Business informatics", and vice versa.
     *
     * @return The new specialisation
     */
    public Specialisation changeSpecialisation(){
        if(this.specialisation == Specialisation.SOFTWAREENGINEERING){
            this.specialisation = Specialisation.BUSINESSINFORMATICS;
        }
        else if(this.specialisation == Specialisation.BUSINESSINFORMATICS){
            this.specialisation = Specialisation.SOFTWAREENGINEERING;
        }
        return this.specialisation;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", PCN=" + PCN +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialisation=" + specialisation +
                '}';
    }

    //GETTERS AND SETTERS

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPCN() {
        return PCN;
    }
	public void setPCN(Integer pcn) {
		this.PCN = pcn;
	}
	public void setId(Integer id){
		this.id = id;
	}
}
