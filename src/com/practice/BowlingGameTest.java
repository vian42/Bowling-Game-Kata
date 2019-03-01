package com.practice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    private BowlingGame object;

    @Before
    public void initGame() {
        object = new BowlingGame();
    }

    @Test
    public void test() {
        assertNotNull("BowlingGame ne peut être null", object);
    }

}