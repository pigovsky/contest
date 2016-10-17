package com.Pylypchuk.lab1.model;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Calendar;

public class Worker
{
    //region Constructors
    /**Constructs a person with one property
     * @param lastName  string with last name of worker
     */
    public Worker(String lastName)
    {
        this.lastName = lastName;
    }

    /**Constructs a person with two properties
     * @param lastName   string with last name of worker
     * @param firstName  string with first name of worker
     */
    public Worker(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /**Constructs a person with three properties
     * @param lastName   string with last name of worker
     * @param firstName  string with first name of worker
     * @param middleName string with middle name of worker
     */
    public Worker(String lastName, String firstName, String middleName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    /**Constructs a person with four properties
     * @param lastName          string with last name of worker
     * @param firstName         string with first name of worker
     * @param middleName        string with middle name of worker
     * @param recruitmentYear   year, when the worker was appoint to post
     */
    public Worker(String lastName, String firstName, String middleName, int recruitmentYear)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.recruitmentYear = recruitmentYear;
    }

    /**Constructs a person with five properties
     * @param lastName          string with last name of worker
     * @param firstName         string with first name of worker
     * @param middleName        string with middle name of worker
     * @param recruitmentYear   year, when the worker was appoint to post
     * @param birthYear         year, when the worker was born
     */
    public Worker(String lastName, String firstName, String middleName, int recruitmentYear, int birthYear)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.recruitmentYear = recruitmentYear;
        this.birthYear = birthYear;
    }

    /**Constructs a person with five properties
     * @param lastName          string with last name of worker
     * @param firstName         string with first name of worker
     * @param middleName        string with middle name of worker
     * @param recruitmentYear   year, when the worker was appoint to post
     * @param birthYear         year, when the worker was born
     * @param mainPlaceOfWork   place, where person is working
     */
    public Worker(String lastName, String firstName, String middleName, int recruitmentYear, int birthYear, String mainPlaceOfWork)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.recruitmentYear = recruitmentYear;
        this.birthYear = birthYear;
        this.mainPlaceOfWork = mainPlaceOfWork;
    }
    //endregion

    //region Getters
    /**Method that return field lastName
     *@return last name of worker
     */
    public String getLastName() {
        return lastName;
    }

    /**Method that return field firstName
     *@return first name of worker
     */
    public String getFirstName() {
        return firstName;
    }

    /**Method that return field middleName
     *@return middle name of worker
     */
    public String getMiddleName() {
        return middleName;
    }

    /**Method that return year, when worker was appoint to post
     *@return year of appointin to post
     */
    public int getRecruitmentYear() {
        return recruitmentYear;
    }

    /**Method that return year, when worker was born
     *@return birth year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**Method that return field mainPlaceOfWork
     *@return place of working
     */
    public String getMainPlaceOfWork() {
        return mainPlaceOfWork;
    }
    //endregion

    //region Setters
    /**Method that set field lastName
     *@param lastName last name of worker
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**Method that set field firstName
     *@param firstName first name of worker
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**Method that set field middleName
     *@param middleName middle name of worker
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**Method that set field recruitmentYear
     *@param recruitmentYear year, when worker was appointed to post
     */
    public void setRecruitmentYear(int recruitmentYear) {
        this.recruitmentYear = recruitmentYear;
    }

    /**Method that set field birthYear
     *@param birthYear year, when worker was born
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**Method that set field mainPlaceOfWork
     *@param mainPlaceOfWork place, where person works
     */
    public void setMainPlaceOfWork(String mainPlaceOfWork) {
        this.mainPlaceOfWork = mainPlaceOfWork;
    }
    //endregion

    /**
     * Overrided method that return full information about worker
     * @return  string with information about worker
     */
    @Override
    public String toString()
    {
        return  "Worker " + System.lineSeparator() +
                "LastName : " + lastName + System.lineSeparator() +
                "FirstName : " + firstName + System.lineSeparator() +
                "MiddleName : " + middleName + System.lineSeparator() +
                "RecruitmentYear : " + recruitmentYear + System.lineSeparator() +
                "BirthYear : " + birthYear + System.lineSeparator() +
                "MainPlaceOfWork : " + mainPlaceOfWork + System.lineSeparator();
    }

    public int getAge()
    {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - this.birthYear;
    }
    //region Fields
    /**
     * Last name of the worker
     */
    private String lastName;
    /**
     * First name of the worker
     */
    private String firstName;
    /**
     * Middle name of the worker
     */
    private String middleName;
    /**
     * Year, when worker was appointed to post
     */
    private int recruitmentYear;
    /**
     * Year, when worker was born
     */
    private int birthYear;
    /**
     * Main place of working
     */
    private String mainPlaceOfWork;
    //endregion
}
