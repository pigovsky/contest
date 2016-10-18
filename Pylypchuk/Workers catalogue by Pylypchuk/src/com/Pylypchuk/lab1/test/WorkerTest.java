package com.Pylypchuk.lab1.test;

import com.Pylypchuk.lab1.util.WorkerBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test if age computed correctly
 */
public class WorkerTest {
    @Test
    public void testGetAge() throws Exception
    {
        assertEquals(19,new WorkerBuilder().birthYear(1997).build().getAge());
    }
}