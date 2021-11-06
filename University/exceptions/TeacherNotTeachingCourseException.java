package University.exceptions;

public class TeacherNotTeachingCourseException extends Exception {
    public TeacherNotTeachingCourseException() {
        super("The Teacher is not valid for teaching the course");
    }
}
