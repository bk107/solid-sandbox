package University.main;

import java.time.LocalDate;

import University.exceptions.InvalidCourseTypeException;
import University.exceptions.TeacherNotTeachingCourseException;
import University.models.PhysicsTeacher;
import University.models.SportsCourse;
import University.models.SportsTeacher;
import University.models.SportsTutor;
import University.models.Student;
import University.models.Teacher;
import University.types.CourseType;

public class Main {

    public static void main(String[] args) {
        SportsTeacher teacher = new SportsTeacher("Hans", "Werner", LocalDate.of(1965, 10, 31),
                "hans.werner@university.com", 65000.0);

        Student student = new Student("Bastian", "Kaltdorf", LocalDate.of(1993, 7, 10),
                "bastian.kaltdorf@university.edu.com", CourseType.SPORT);

        SportsCourse sportsCourse = new SportsCourse("Sport 101", teacher);

        sportsCourse.addStudent(student);

        sportsCourse.printPersonList();
        sportsCourse.printTeacherFullName();

        SportsTutor sportsTutor = new SportsTutor("Jens", "Mirko", LocalDate.of(1970, 3, 22), "jens.mirko@uni.edu");

        sportsCourse.setSubstitionTeacher(sportsTutor);

        System.out.println("But today, the teacher is sick, therefore substition will be "
                + sportsCourse.getSubstitionTeacher().getFullName());

        Teacher physicsTeacher = new PhysicsTeacher("Peter", "Weinberg", LocalDate.of(1988, 12, 31),
                "peter.weinberg@uni.edu", 120000.0);

        try {
            physicsTeacher.addCourseType(CourseType.SPORT);
            sportsCourse.setTeacher(physicsTeacher);
        } catch (InvalidCourseTypeException e) {
            System.err.println(e.getMessage());
        } catch (TeacherNotTeachingCourseException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
