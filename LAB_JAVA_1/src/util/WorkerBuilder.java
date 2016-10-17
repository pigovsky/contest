package util;

import com.viktor.model.Worker;


public class WorkerBuilder
{
    private Worker newInstance;

    public WorkerBuilder()
    {
        newInstance = new Worker();
    }

    public WorkerBuilder surname(String surn)
    {
        newInstance.setSurname(surn);
        return this;
    }
    public WorkerBuilder names(String name)
    {
        newInstance.setName(name);
        return this;
    }
    public WorkerBuilder yearOfBirth(Integer anotherYearOfBirhday)
    {
        newInstance.setYear_of_birth(anotherYearOfBirhday);
        return this;
    }

    public WorkerBuilder male(String name)
    {
        if(name.equals("Marianna")){
            newInstance.setMale("female");
        } else {
            newInstance.setMale("male");
        }

        return this;
    }

    public Worker build()
    {
        return newInstance;
    }

    public static Worker[] generateWorkers()
    {
        Worker arrayOfWorkers[] = new Worker[10];
        RandWorker newRandom;
        for(Integer i = 0 ; i<arrayOfWorkers.length;i++)
        {
            newRandom = new RandWorker();
            arrayOfWorkers[i] = new WorkerBuilder().surname(newRandom.getRandomSurname()).names(newRandom.getRandomName())
                    .yearOfBirth(newRandom.getRandomYearOfBirth()).male(newRandom.getRandomSurname()).build();
        }
        return  arrayOfWorkers;
    }
}