package com.cicd.calculator.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator cal;

    @BeforeEach
    void init(){
         cal=new Calculator();
    }

    @Test
    void testSetFirstValue(){
        cal.setFirstValue(4);
        assertEquals(4,cal.getFirstValue());
    }
    @Test
    void testSetSecondValue(){
        cal.setSecondValue(-6);
        assertEquals(-6,cal.getSecondValue());
    }
    @Test
    void testGetfirstValue()
    {
        cal.setFirstValue(3);
        assertEquals(3,cal.getFirstValue());

    }
    @Test
    void testGetSecondValue()
    {
        cal.setSecondValue(3);
        assertEquals(3,cal.getSecondValue());

    }
    @Test
    @DisplayName("Testing the Add Method")
     void testAdd() {
        assertEquals(5,cal.Add(2,3));

    }
    @Test
    @DisplayName("Testing the Subtraction Method")
    void testSubtract(){
        assertEquals(1,cal.Subtract(3,2));
        assertEquals(-5,cal.Subtract(-3,2));
    }
    @Test
    @DisplayName("Testing the Multiply Method")
    void testMultiply(){
        assertAll(
                () ->assertEquals(6,cal.Multiply(2,3)),
                () ->assertEquals(0,cal.Multiply(0,3)),
                () ->assertEquals(6,cal.Multiply(-2,-3)),
                () ->assertEquals(-6,cal.Multiply(-2,3))
        );
    }

    @Test
    @DisplayName("Testing the Divide Method")
    void testDivide(){
        assertEquals(2,cal.Divide(6,3));
        assertEquals(0,cal.Divide(2,0));
    }

}