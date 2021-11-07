package University.exceptions;

import University.types.CourseType;

public class InvalidCourseTypeException extends Exception {

    public InvalidCourseTypeException(CourseType courseType) {
        super("Error: The course type is invalid " + courseType);
    }

}
