package com.kate.stubMockTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class InformerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void restInfo42Of80Test() {
        //Arrange
        Restorant restorantToTest = new Restorant();
        restorantToTest.setRestirantName("Test1");
        restorantToTest.setTotalCapacity(80);
        restorantToTest.setFreecapacity(42);
        Informer informerTest = new Informer(restorantToTest);
        String expected = "Restorant Name: Test1 with full capacity 80 and free capacity 42";

        //Act
        String actual = informerTest.restInfo();

        //Assert
        Assert.assertEquals("Expected: String will be 'Restorant Name: Test1 with full capacity 80 and free capacity 42'", actual, expected);
    }
    @Test
    public void infoStubTest(){
        //Arrange
        Informer informer = new Informer(new RestorantStub());
        String expected = "Restorant Name: null with full capacity 43 and free capacity 42";
        //Act
        String actual = informer.restInfo();
        //Assert
        Assert.assertEquals("Expected: String will be 'Restorant Name: null with full capacity 43 and free capacity 42'",
                actual, expected);

    }
    @Test
    public void infoMockTest(){
        //Arrange
        Restorant mockRestorant = mock(Restorant.class);
        when(mockRestorant.capacity()).thenReturn(new int[]{42,43});
        when(mockRestorant.getFreecapacity()).thenReturn(42);
        when(mockRestorant.getTotalCapacity()).thenReturn(43);
        Informer informer = new Informer(mockRestorant);
        String expected = "Restorant Name: null with full capacity 43 and free capacity 42";
        //Act
        String actual = informer.restInfo();
        //Assert
        Assert.assertEquals("Expected: String will be 'Restorant Name: null with full capacity 43 and free capacity 42'",
                actual, expected);
        verify(mockRestorant, Mockito.times(1)).capacity();
    }
}