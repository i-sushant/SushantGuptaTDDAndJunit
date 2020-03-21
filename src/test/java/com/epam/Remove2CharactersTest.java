package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class Remove2CharactersTest {

    Remove2Characters r2c;
    @BeforeEach
    void setup(){
        r2c = new Remove2Characters();
    }
    @Test
    void removefromNChars() {
        assertEquals("BCD", r2c.remove("ABCD"));
        assertEquals("CD", r2c.remove("AACD"));
        assertEquals("BCD", r2c.remove("BACD"));
        assertEquals("BBAA", r2c.remove("BBAA"));
        assertEquals("BAA", r2c.remove("AABAA"));
        assertEquals("1DB", r2c.remove("A1DB"));
    }
    @Test
    void removeFromNullString(){
        assertEquals("", r2c.remove(""));
    }

    @Test
    void removeFrom1Char(){
        assertEquals("", r2c.remove("A"));
        assertEquals("B", r2c.remove("B"));
    }
    @Test
    void removeFrom2Chars(){
        assertEquals("B", r2c.remove("AB"));
        assertEquals("", r2c.remove("AA"));
        assertEquals("B1", r2c.remove("B1"));
    }

}