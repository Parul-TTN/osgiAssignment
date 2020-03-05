package services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import pojo.Student;

import java.util.List;

@Component(service = ClassConfigurationServiceImplementation.class)
@Designate(ocd= StudentConfiguration.class)
public class ClassConfigurationServiceImplementation{

    @Activate
    private StudentConfiguration studentConfiguration;


    public boolean isClassLimitReach(List<Student> students) {
        if(students.size()>=studentConfiguration.noOfStudent()) {
            return true;
        }else{
            return false;
        }
    }

    public int getPassingMarks() {
        return studentConfiguration.passingMarks();
    }
}

