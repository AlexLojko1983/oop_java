package org.geekbrains.lesson4.homework3.models;

import java.time.LocalDate;

public class Teacher extends User{
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }
}
