package services.impl;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import pojo.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(service = StudentClassServiceImplementation.class)
public class StudentClassServiceImplementation{
    private List<Student> students = new ArrayList<Student>();

    @Reference
    ClassConfigurationServiceImplementation classConfigurationService;

    public void addStudents(Student values) {
        if(!classConfigurationService.isClassLimitReach(students)){
            students.add(values);
        }
        else{
            System.out.println("class limit reached");
        }
    }

    public void deleteStudent(int id) {
        Iterator studentItr = students.iterator();
        while(studentItr.hasNext()){
            Student student = (Student) studentItr.next();
            if(student.getId()==id){
                studentItr.remove();
                System.out.println("Student Deleted");
                break;
            }
        }
    }

    public boolean isStudentPassed(int id) {
        for (Student student : students) {
            if(student.getId()==id){
                return student.getMarks()>=classConfigurationService.getPassingMarks();
            }
        }
        return false;
    }

    public Student getStudent(int id) {
        for (Student student : students) {
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudent() {
        return students;
    }
}
