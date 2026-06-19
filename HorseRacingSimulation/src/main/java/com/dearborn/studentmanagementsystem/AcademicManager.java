/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dearborn.studentmanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dearbornchisale
 */
public class AcademicManager {

    private HashMap<Integer, Student> students;
    private HashMap<String, LinkedHashSet<Student>> courseEnrollments;

    public AcademicManager() {
        students = new HashMap<>();
        courseEnrollments = new HashMap<>();

    }

    public boolean addStudent(Student student) {

        if (students.containsKey(student.getStudentID())) {
            return false;
        }

        students.put(student.getStudentID(), student);
        return true;

    }

    public Student getStudent(int studentID) {
        return students.get(studentID);
    }

    public boolean enrollStudent(String courseName, Student student) {

        if (!students.containsKey(student.getStudentID())) {
            return false;
        }

        courseEnrollments.putIfAbsent(courseName, new LinkedHashSet<>());

        courseEnrollments.get(courseName).add(student);

        return true;

    }

    public Set<Student> getStudnetsInCourse(String courseName) {
        return courseEnrollments.get(courseName);
    }
    
    public void displayStudentsSortedByName(){
        List<Student> studentList = new ArrayList<>(students.values());
        
        studentList.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        
        for(Student student : studentList){
            System.out.println(student);
        }
    }
    
    public void displayStudentCountPerCourse() {

        for (String course : courseEnrollments.keySet()) {

            int count = courseEnrollments.get(course).size();

            System.out.println(course + " : " + count + " students ");

        }

    }
    
    public boolean deleteStudent(int studentID) {

        if (students.containsKey(studentID)) {
            students.remove(studentID);
            return true;
        }

        return false;
    }
    
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>(students.values());

        studentList.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));

        return studentList;

    }
     
     
     

    @Override
    public String toString() {
        return "AcademicManager{" + "students=" + students + ", courseEnrollments=" + courseEnrollments + '}';
    }
    
    

}
