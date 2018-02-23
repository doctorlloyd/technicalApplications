/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ABRMA86
 */
@Entity
@Table(name="ClassList")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long studentNumber;
    private String name;
    private String surname;
    private Character gender;
    private String email;
    private String cellNo;

    public Student() {
    }

    public Student(Long studentNumber, String name, String surname, Character gender, String email, String cellNo) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.cellNo = cellNo;
    }

    
    
    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

  
    
   

    @Override
    public String toString() {
        return "za.ac.tut.entities.Student[ id=" + studentNumber + " ]";
    }
    
}
