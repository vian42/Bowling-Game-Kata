package com.practice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    private BowlingGame game;

    @Before
    public void initGame() {
        game = new BowlingGame();
    }

    @Test
    public void should_have_access_to_a_game() {
        assertNotNull("BowlingGame ne peut être null", game);
    }

    @Test
    public void initial_score_is_0() {
        Integer score = game.getScore();
        assertEquals(Integer.valueOf(0), score);
    }

    @Test
    public void name() {
        game.roll(0);
        Integer score = game.getScore();
        assertEquals(Integer.valueOf(0), score);
    }
}