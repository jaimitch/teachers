package com.theironyard.installparty;

public class Teacher {

    String firstName;
    String lastName;
    int id;
    int grade;

    public Teacher(String firstName, String lastName, int id, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setGrade(int grade) {

        this.grade = grade;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getId() {

        return id;
    }

    public int getGrade() {

        return grade;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;

        Teacher student = (Teacher) o;

        return getId() == student.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}
