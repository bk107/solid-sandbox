package University.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import University.exceptions.InvalidCourseTypeException;
import University.interfaces.ITeacher;
import University.types.CourseType;
import University.types.PersonType;

public class Teacher extends Person implements ITeacher {

    private Double salary;
    private List<CourseType> courseTypes;

    public Teacher(String firstName, String lastName, LocalDate dateOfBirth, String email, Double salary) {
        super(firstName, lastName, dateOfBirth, email);
        this.salary = salary;
        this.setType(PersonType.TEACHER);
        this.courseTypes = new ArrayList<CourseType>();
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public void teach() {
        System.out.println("Teacher " + getFullName() + " is teaching");
        for (CourseType ct : courseTypes) {
            System.out.println(ct.name());
        }
    }

    @Override
    public Boolean isTeaching(CourseType courseType) {
        return courseTypes.contains(courseType);
    }

    @Override
    public void addCourseType(CourseType courseType) throws InvalidCourseTypeException {
        courseTypes.add(courseType);
    }

}
