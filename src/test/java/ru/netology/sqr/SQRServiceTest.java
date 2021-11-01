package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldsquaresnumber0
            () {

        SQRService sqrService = new SQRService();
        int expected = 5;
        int actual = sqrService.squaresnumber(100,200);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldsquaresnumber1() {

        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.squaresnumber(0, 100);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldsquaresnumber2() {

        SQRService sqrService = new SQRService();
        int expected = 0;
        int actual = sqrService.squaresnumber(0, 99);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldsquaresnumber3() {

        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.squaresnumber(9801, 10000);
        assertEquals(expected, actual);
    }
    @Test
    public void shouldsquaresnumber4() {

        SQRService sqrService = new SQRService();
        int expected = 0;
        int actual = sqrService.squaresnumber(9802, 11000);
        assertEquals(expected, actual);
    }
}