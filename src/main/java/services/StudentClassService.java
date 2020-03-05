package services;

import pojo.Student;

import java.util.List;

public interface StudentClassService {
    void addStudents(Student  values);
    void deleteStudent(int id);
    boolean isStudentPassed(int id);
    Student getStudent(int id);
    List<Student> getAllStudent();
}
