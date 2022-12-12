package java8.classes;

import java8.MyException.MyException;
import java8.enums.Country;
import java8.enums.Gender;

import java.time.LocalDate;

public class Person {
    private String surName;
    private String name;
    private LocalDate dateOfBirth;
    private long id;
    private Gender gender;
    private Country country;
    private String phoneNumber;

    public Person(String surName, String name, LocalDate dateOfBirth, long id, Gender gender, Country country, String phoneNumber) {
        this.surName = surName;
        this.name = name;
        checkAge(dateOfBirth);
        this.id = id;
        this.gender = gender;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    private void checkAge(LocalDate dateOfBirth){
        try {
            LocalDate now = LocalDate.now();
            if (!dateOfBirth.isBefore(now)){
                throw new MyException("tuura jaz");
            }else {
                this.dateOfBirth=dateOfBirth;
            }
        } catch (MyException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public String toString() {
        return "Person" +
                "\n surName: " + surName +
                "\n name: " + name +
                "\n dateOfBirth: " + dateOfBirth +
                "\n id: " + id +
                "\n gender: " + gender +
                "\n country: " + country +
                "\n phoneNumber: " + phoneNumber +
                "\n+++++++++++++++++++++++++++++++++++++++++";
    }
}
