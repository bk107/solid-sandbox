package University.printer;

import java.util.List;

import University.interfaces.IStudentListPrinter;
import University.models.Person;
import University.models.Student;

public class PersonListPrinter implements IStudentListPrinter {

    public void printPersonFullName(Person p) {
        System.out.println(p.getFullName());
    }

    @Override
    public void printStudentList(List<Student> personList) {
        for (Person p : personList) {
            printPersonFullName(p);
        }
    }

}
