package com.kate.stubMockTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class RestorantTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void capacity42of80Test() {
        //Arange
        Restorant restorantToTest = new Restorant();
        restorantToTest.setRestirantName("Test1");
        restorantToTest.setTotalCapacity(80);
        restorantToTest.setFreecapacity(42);
        int[] expected = {42,80};

        //Act
        int[] actual = restorantToTest.capacity();

        //Assert
        Assert.assertArrayEquals("" +
                "expected total capacity 80 and free capacity 42",actual, expected);
    }
}