package University.models;

import java.time.LocalDate;

import University.types.CourseType;
import University.types.PersonType;

public class Student extends Person {

    private CourseType favoriteCourseType;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String email,
            CourseType favoriteCourseType) {
        super(firstName, lastName, dateOfBirth, email);
        this.favoriteCourseType = favoriteCourseType;
        this.setType(PersonType.STUDENT);
    }

    public void setFavoriteCourseType(CourseType favoriteCourseType) {
        this.favoriteCourseType = favoriteCourseType;
    }

    public CourseType getFavoriteCourseType() {
        return favoriteCourseType;
    }

}
