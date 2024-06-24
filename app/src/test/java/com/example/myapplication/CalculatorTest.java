package com.example.myapplication;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator calculator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator=new Calculator();
    }

    public void testAdd() {
        int expected = 30;
        int actual= calculator.add(20,10);
        assertEquals(expected,actual);
    }
    public void testmul(){
        int expected = 20;
        int actual= calculator.mul(4,5);
        assertEquals(expected,actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}