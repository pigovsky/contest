package com.viktor.model;

public class Worker {
    public String surname;
    public String name;
    public Integer yearOfEemployment;
    public Integer birthDay;
    public String placeOfWork;
    public String Male;

    public Worker() {
        surname = "";
        name = "";
        yearOfEemployment = 2000;
        birthDay = -1;
        placeOfWork = "Eleks";
        Male ="";
    }

    public Worker(String surname)
    {
        this.surname = surname;
    }

    public Worker(String surname, String name)
    {
        this.surname = surname;
        this.name = name;
    }

    public Worker(String surname, String name, Integer yearOfEemployment)
    {
        this.surname = surname;
        this.name = name;
        this.yearOfEemployment = yearOfEemployment;
    }

    public Worker(String surname, String name, Integer yearOfEemployment, Integer birthDay)
    {
        this.surname = surname;
        this.name = name;
        this.yearOfEemployment = yearOfEemployment;
        this.birthDay = birthDay;
    }

    public Worker(String surname, String name, Integer yearOfEemployment, Integer birthDay, String placeOfWork)
    {
        this.surname = surname;
        this.name = name;
        this.yearOfEemployment = yearOfEemployment;
        this.birthDay = birthDay;
        this.placeOfWork = placeOfWork;
    }
    public Worker(String surname, String name, Integer yearOfEemployment, Integer birthDay, String placeOfWork, String male)
    {
        this.surname = surname;
        this.name = name;
        this.yearOfEemployment = yearOfEemployment;
        this.birthDay = birthDay;
        this.placeOfWork = placeOfWork;
        this.Male = male;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getyearOfEemployment()
    {
        return yearOfEemployment;
    }

    public void setYear_of_employment(Integer yearOfEemployment)
    {
        this.yearOfEemployment = yearOfEemployment;
    }

    public Integer getbirthDay()
    {
        return birthDay;
    }

    public void setYear_of_birth(Integer birthDay)
    {
        this.birthDay = birthDay;
    }

    public String getplaceOfWork()
    {
        return placeOfWork;
    }

    public void setplaceOfWork(String placeOfWork)

    {
        this.placeOfWork = placeOfWork;
    }
    public String getMale()
    {
        return Male;
    }

    public void setMale(String male)
    {
        this.Male = male;
    }

    @Override public String toString() {
        String strintToReturn = "";
        strintToReturn += "Surname: " + surname+"\n";
        strintToReturn += "Name: " + name+"\n";
        strintToReturn += "Year of employment: " + yearOfEemployment+"\n";
        strintToReturn += "Birthday date: " + birthDay+"\n";
        strintToReturn += "Place of work: " + placeOfWork+"\n";
        strintToReturn += "Worker sex: " + Male +"\n";
        return strintToReturn;
    }

}