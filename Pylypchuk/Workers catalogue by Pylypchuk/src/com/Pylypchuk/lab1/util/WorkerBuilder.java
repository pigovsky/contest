package com.Pylypchuk.lab1.util;

import com.Pylypchuk.lab1.model.Worker;

/**
 * WorkerBuilder is class that's realize design pattern builder.
 * This class create instances of class Worker.
 */
public class WorkerBuilder
{
    //region SetMethods
    /**
     * Set last name for instance myWorker
     * @param  lastName  string with last name of worker
     * @return           object which was calling method
     */
    public WorkerBuilder lastName(String lastName)
    {
        myWorker.setLastName(lastName);
        return this;
    }

    /**
     * Set first name for instance myWorker
     * @param  firstName  string with first name of worker
     * @return            instance which was calling method
     */
    public WorkerBuilder firstName(String firstName)
    {
        myWorker.setFirstName(firstName);
        return this;
    }

    /**
     * Set middle name for instance myWorker
     * @param  middleName  string with middle name of worker
     * @return            instance which was calling method
     */
    public WorkerBuilder middleName(String middleName)
    {
        myWorker.setMiddleName(middleName);
        return this;
    }

    /**
     * Set year, when the worker was appointed to the post
     * @param  recruitmentYear  year of this event
     * @return            instance which was calling method
     */
    public WorkerBuilder recruitmentYear(int recruitmentYear)
    {
        myWorker.setRecruitmentYear(recruitmentYear);
        return this;
    }

    /**
     * Set year, when the worker was born
     * @param  birthYear  year of birth
     * @return            instance which was calling method
     */
    public WorkerBuilder birthYear(int birthYear)
    {
        myWorker.setBirthYear(birthYear);
        return this;
    }

    /**
     * Set place of working
     * @param  place      string with main place of working
     * @return            instance which was calling method
     */
    public WorkerBuilder mainPlaceOfWork(String place)
    {
        myWorker.setMainPlaceOfWork(place);
        return this;
    }
    //endregion

    /**
     * Returns instance of class Worker
     * which is filled default values or custom
     * @return      instance of class Worker
     */
    public Worker build()
    {
        return myWorker;
    }

    /**
     * Returns an array of instances of the class Worker
     * which is filled random names and birth years
     * @return      an array of instances of class Worker
     */
    public static Worker[] generateWorkers()
    {
        Worker[] workers= new Worker[10];
        String[] names = {"Vadim","Kolya","Vitalik","Victor","Sasha","Marian","Sergiy","Dima","Roman","Ostap"};
        int[] years = {1976,1995,1890,1999,1969,1986,1994,1997,1988,1970};

        for(int i=0;i<workers.length;i++)
            workers[i] = new Worker(null,names[(int)(Math.random()*10)],null,0,years[(int)(Math.random()*10)]);

        return workers;
    }

    /**
     * instance of class Worker with default fields
     */
    private Worker myWorker = new Worker(null,null,null,0,0,null);
}
