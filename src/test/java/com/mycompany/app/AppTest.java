package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void fibTest1(){
        App app = new App();
        int result = app.fib(1);
        assertTrue(result == 1);
    }

    @Test
    void fibTest2(){
        App app = new App();
        int result = app.fib(2);
        assertTrue(result == 1);
    }

    @Test
    void fibTest5(){
        App app = new App();
        int result = app.fib(5);
        assertTrue(result == 5);
    }

    @Test
    void fibTest7(){
        App app = new App();
        int result = app.fib(7);
        assertTrue(result == 13);
    }
}
