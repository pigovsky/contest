package com.Pylypchuk.lab1.test;

import com.Pylypchuk.lab1.util.WorkerBuilder;
import com.Pylypchuk.lab1.model.Worker;

import static org.junit.Assert.*;

/**
 *  Test if builder provides defaults
 */
public class WorkerBuilderTest {
    WorkerBuilder workerBuilder;

    @org.junit.Before
    public void setUp() throws Exception
    {
        workerBuilder=new WorkerBuilder();
    }

    @org.junit.Test
    public void build() throws Exception
    {
        Worker worker = workerBuilder.lastName("Pylypchuk").build();
        assertNull("Year of birth is not null, but it should be null by default!", worker.getRecruitmentYear());
        assertNull("Year of appointment is not null, but it should be null by default!", worker.getRecruitmentYear());
    }

}