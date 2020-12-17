package com.cicd.calculator.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.StringReader;


class InsprirationTest {



    @Test
    void testQuote() {
        Inspriration insp = new Inspriration();
        int select_Quote= insp.getCallCounter();
        if(select_Quote==1){
            assertEquals("1",insp.Quote().toString());
        }
        assertNotNull(insp.Quote().toString());

    }

    @Test
    void testGetCallCounter(){
        Inspriration insp = new Inspriration();
        assertEquals(0,insp.getCallCounter());

    }
}
