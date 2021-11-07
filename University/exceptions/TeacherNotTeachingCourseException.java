package University.exceptions;

import University.types.CourseType;

public class TeacherNotTeachingCourseException extends Exception {
    public TeacherNotTeachingCourseException(CourseType courseType) {
        super("Error: The Teacher is not valid for teaching the course "+courseType);
    }
}
