package University.models;

import java.time.LocalDate;

import University.exceptions.InvalidCourseTypeException;
import University.types.CourseType;

public class PhysicsTeacher extends Teacher {

    public PhysicsTeacher(String firstName, String lastName, LocalDate dateOfBirth, String email, Double salary) {
        super(firstName, lastName, dateOfBirth, email, salary);
        try {
            addCourseType(CourseType.SCIENCE);
        } catch (InvalidCourseTypeException ex) {
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public void teach() {
        System.out.println("Teaching physics");
    }

    @Override
    public void addCourseType(CourseType courseType) throws InvalidCourseTypeException {
        if (courseType != CourseType.SCIENCE) {
            throw new InvalidCourseTypeException(courseType);
        }

        super.addCourseType(courseType);
    }

}
