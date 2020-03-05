package services;

import pojo.Student;

import java.util.List;

public interface ClassConfigurationService {

    boolean isClassLimitReach(List<Student> students);
    int getPassingMarks();
}
