package University.models;

import java.util.ArrayList;
import java.util.List;

import University.interfaces.ICourse;
import University.interfaces.ICourseTeacherPrinter;
import University.interfaces.IPersonListPrinter;
import University.interfaces.ISubstitionTeacher;
import University.interfaces.ITeacher;
import University.types.CourseType;

public abstract class Course implements IPersonListPrinter, ICourse, ICourseTeacherPrinter {

    String name;
    ITeacher teacher;
    ISubstitionTeacher substitionTeacher;
    List<Student> students;
    CourseType courseType;

    public Course(String name, ITeacher teacher) {
        this.name = name;
        this.teacher = teacher;
        students = new ArrayList<Student>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ITeacher getTeacher() {
        return teacher;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setSubstitionTeacher(ISubstitionTeacher substitionTeacher) {
        this.substitionTeacher = substitionTeacher;
    }

    public ISubstitionTeacher getSubstitionTeacher() {
        return substitionTeacher;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void printPersonList() {
        System.out.println("The following students are participating course " + name + ": ");
        for (Person p : students) {
            System.out.println(p.getFullName());
        }
    }

    @Override
    public void printTeacherFullName() {
        System.out.println("The teacher of " + name + " is: " + teacher.getFullName());
    }

    @Override
    public void printSubstitionTeacherFullName() {
        System.out.println("The substition teacher of " + name + " is: " + substitionTeacher.getFullName());
    }
}
