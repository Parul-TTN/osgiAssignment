package services.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="config")
public @interface StudentConfiguration{
    @AttributeDefinition(name="noOfStudents", type= AttributeType.INTEGER,description = "No of students ")
    int noOfStudent() default 5;

    @AttributeDefinition(name="passing marlks",type= AttributeType.INTEGER,description = "passing marks ")
    int passingMarks() default 50;
}
