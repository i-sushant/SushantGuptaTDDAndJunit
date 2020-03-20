package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Remove2CharactersTest {

    @Test
    void removefromNChars() {
        assertEquals(Remove2Characters.remove("ABCD"), "BCD");
        assertEquals(Remove2Characters.remove("AACD"), "CD");
        assertEquals(Remove2Characters.remove("BACD"), "BCD");
        assertEquals(Remove2Characters.remove("BBAA"), "BBAA");
        assertEquals(Remove2Characters.remove("AABAA"), "BAA");
        assertEquals(Remove2Characters.remove("A1DB"), "1DB");
    }
    @Test
    void removeFromNullString(){
        assertEquals(Remove2Characters.remove(""), "");
    }

    @Test
    void removeFrom1Char(){
        assertEquals(Remove2Characters.remove("A"),"");
        assertEquals(Remove2Characters.remove("B"),"B");
    }
    @Test
    void removeFrom2Chars(){
        assertEquals(Remove2Characters.remove("AB"), "B");
        assertEquals(Remove2Characters.remove("AA"), "");
        assertEquals(Remove2Characters.remove("B1"), "B1");
    }

}