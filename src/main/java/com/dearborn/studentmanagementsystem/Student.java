package com.dearborn.studentmanagementsystem;

import java.util.Objects;

/**
 *
 * @author dearbornchisale
 */
public class Student {

    private int studentID;
    private String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.studentID != other.studentID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentID = " + studentID + "\n name = " + name;
    }

}
