import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import pojo.Student;
import services.impl.StudentClassServiceImplementation;

@Component
public class MainComp {

    @Reference
    StudentClassServiceImplementation studentClassService;


    @Activate
    void activate() {
        System.out.println("Started");
        Student s1 = new Student(1, "s1", 23, 13);
        studentClassService.addStudents(s1);
        Student s2 = new Student(2, "s2", 63, 13);
        studentClassService.addStudents(s2);
        Student s3 = new Student(3, "s3", 54, 13);
        studentClassService.addStudents(s3);
        Student s4 = new Student(4, "s4", 20, 13);
        studentClassService.addStudents(s4);
        Student s5 = new Student(5, "s5", 58, 14);
        studentClassService.addStudents(s5);
        Student s6 = new Student(6,"s6",23,13);
        studentClassService.addStudents(s6);

        System.out.println("\n\n Get all students");
        for (Student student : studentClassService.getAllStudent()) {
            System.out.println(student);
        }

        System.out.println("\n\n Get Student 3 ");
        System.out.println(studentClassService.getStudent(3));

        System.out.println("\n\n Is Student 3 Passed");
        System.out.println(studentClassService.isStudentPassed(3));

        System.out.println("\n\n Delete Student 3 ");
        studentClassService.deleteStudent(3);

        System.out.println("\n\n Get all students");
        for (Student student : studentClassService.getAllStudent()) {
            System.out.println(student);
        }



    }
}
