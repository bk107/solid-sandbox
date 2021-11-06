package University.models;

import java.time.LocalDate;

import University.interfaces.ISubstitionTeacher;

public abstract class Tutor extends Person implements ISubstitionTeacher {

    public Tutor(String firstName, String lastName, LocalDate dateOfBirth, String email) {
        super(firstName, lastName, dateOfBirth, email);
    }

}
