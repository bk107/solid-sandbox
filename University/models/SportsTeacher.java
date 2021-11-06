package University.models;

import java.time.LocalDate;

import University.interfaces.ISportsTeacher;

public class SportsTeacher extends Teacher implements ISportsTeacher {

    public SportsTeacher(String firstName, String lastName, LocalDate dateOfBirth, String email, Double salary) {
        super(firstName, lastName, dateOfBirth, email, salary);
    }

    @Override
    public void teach() {
        System.out.println("Teaching sports");
    }

    @Override
    public void teachGymnastics() {
        System.out.println("Teaching gymnastics");

    }

}
