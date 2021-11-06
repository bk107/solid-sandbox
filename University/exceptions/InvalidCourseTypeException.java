package University.exceptions;

import University.types.CourseType;

public class InvalidCourseTypeException extends Exception {

    public InvalidCourseTypeException(CourseType courseType) {
        super("The course type is invalid " + courseType);
    }

}
