package University.models;

import java.time.LocalDate;

import University.interfaces.IPersonPrinter;
import University.types.PersonType;

public abstract class Person implements IPersonPrinter {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private PersonType type;

    public Person(String firstName, String lastName, LocalDate dateOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public PersonType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.name() + ": Name: " + getFullName();
    }

    @Override
    public void printFullName() {
        System.out.println(getFullName());
    }
}
