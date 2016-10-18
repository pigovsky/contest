package com.Pylypchuk.lab1.application;

import com.Pylypchuk.lab1.model.Worker;
import com.Pylypchuk.lab1.util.WorkerBuilder;

/**
 * App is executable class that demonstrate
 * mutual work of Worker and WorkerBuilder
 */
public class App
{
    /**
     * Main function is the designated start of the program
     */
    public static void main(String ...args)
    {
        Worker myWorker = new WorkerBuilder().lastName("Pylypchuk")
                .firstName("Andriy")
                    .middleName("Ivanovich")
                        .recruitmentYear(2016)
                            .birthYear(1997)
                                .mainPlaceOfWork("TNEY")
                                    .build();

        System.out.println(myWorker.toString());

        for(Worker worker : WorkerBuilder.generateWorkers())
        {
            System.out.println(worker.toString());
        }
    }
}
