package University.interfaces;

import University.exceptions.InvalidCourseTypeException;
import University.types.CourseType;

public interface ITeacher {

    String getFullName();

    Boolean isTeaching(CourseType courseType);

    void teach();

    void addCourseType(CourseType courseType) throws InvalidCourseTypeException;
}
