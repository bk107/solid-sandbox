package University.models;

import University.exceptions.TeacherNotTeachingCourseException;
import University.interfaces.ISportsTeacher;
import University.interfaces.ITeacher;
import University.types.CourseType;

public class SportsCourse extends Course {

    public SportsCourse(String name, ISportsTeacher teacher) {
        super(name, teacher);
        setCourseType(CourseType.SPORT);
    }

    public void setTeacher(ITeacher teacher) throws TeacherNotTeachingCourseException {

        if (!teacher.isTeaching(courseType)) {
            throw new TeacherNotTeachingCourseException();
        }

        System.out.println("The new teacher for " + name + " is " + teacher.getFullName());
        this.teacher = teacher;
    }

}
