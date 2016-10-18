package com.Fenovka.lab1.model;

public class Worker {

    //Black magic
    private String surname;
    private String name;
    private Integer year_of_employment;
    private Integer year_of_birth;
    private String basic_pace_of_work;

    public Worker() {
        surname = "";
        name = "";
        year_of_employment = -1;
        year_of_birth = -1;
        basic_pace_of_work = "";
    }

    public Worker(String surname) {
        this.surname = surname;
    }

    public Worker(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Worker(String surname, String name, Integer year_of_employment) {
        this.surname = surname;
        this.name = name;
        this.year_of_employment = year_of_employment;
    }

    public Worker(String surname, String name, Integer year_of_employment, Integer year_of_birth) {
        this.surname = surname;
        this.name = name;
        this.year_of_employment = year_of_employment;
        this.year_of_birth = year_of_birth;
    }

    public Worker(String surname, String name, Integer year_of_employment, Integer year_of_birth, String basic_pace_of_work) {
        this.surname = surname;
        this.name = name;
        this.year_of_employment = year_of_employment;
        this.year_of_birth = year_of_birth;
        this.basic_pace_of_work = basic_pace_of_work;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear_of_employment() {
        return year_of_employment;
    }

    public void setYear_of_employment(Integer year_of_employment) {
        this.year_of_employment = year_of_employment;
    }

    public Integer getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(Integer year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getBasic_pace_of_work() {
        return basic_pace_of_work;
    }

    public void setBasic_pace_of_work(String basic_pace_of_work) {
        this.basic_pace_of_work = basic_pace_of_work;
    }

    public String toString() {
        String str = "";
        str += "Surname: " + surname+"\n";
        str += "Name: " + name+"\n";
        str += "Year of employment: " + year_of_employment+"\n";
        str += "Year of birth: " + year_of_birth+"\n";
        str += "Basic pace of work: " + basic_pace_of_work+"\n";
        return str;
    }

}