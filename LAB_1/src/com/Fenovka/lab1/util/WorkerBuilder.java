package com.Fenovka.lab1.util;

import com.Fenovka.lab1.model.Worker;


public class WorkerBuilder  {
    private Worker worker;


    public WorkerBuilder() {
        worker = new Worker();
    }

    public WorkerBuilder surname(String surname){
        worker.setSurname(surname);
        return this;
    }

    public WorkerBuilder names(String name){
        worker.setName(name);
        return this;
    }

    public WorkerBuilder yearOfBirth(Integer year_of_b){
        worker.setYear_of_birth(year_of_b);
        return this;
    }

    public WorkerBuilder yearOfEmployment(Integer emplYear){
        worker.setYear_of_employment(emplYear);
        return this;
    }

    public Worker build(){
        return worker;
    }

    public static Worker[] generateWorkers(Integer countWorker){

        if(countWorker<0)
            countWorker=10;

        Worker Workers[] = new Worker[countWorker];
        RandWorker randomWorker;

        for(Integer i = 0 ; i < Workers.length;i++)
        {
            randomWorker = new RandWorker();
            Workers[i] = new WorkerBuilder().surname(randomWorker.getRandomSurname()).yearOfEmployment(randomWorker.getRandomYearOfEmpl()).names(randomWorker.getRandomName()).yearOfBirth(randomWorker.getRandomYearOfBirth()).build();
        }

        return  Workers;
    }

    public static Worker[] generateWorkers(){

        Worker Workers[] = new Worker[10];
        RandWorker randomWorker;

        for(Integer i = 0 ; i < Workers.length;i++)
        {
            randomWorker = new RandWorker();
            Workers[i] = new WorkerBuilder().surname(randomWorker.getRandomSurname()).yearOfEmployment(randomWorker.getRandomYearOfEmpl()).names(randomWorker.getRandomName()).yearOfBirth(randomWorker.getRandomYearOfBirth()).build();
        }
        
        return  Workers;
    }
}