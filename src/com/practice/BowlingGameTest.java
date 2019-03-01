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
    public void score_after_a_gutter_is_the_same() {
        Integer initScore = game.getScore();
        game.roll(0);
        Integer endScore = game.getScore();
        assertEquals(initScore, endScore);
    }

    @Test
    public void score_evolves_with_no_bonus() {
        Integer pins = 5;
        Integer initScore = game.getScore();
        game.roll(pins);
        Integer endScore = game.getScore();
        Integer expectedScore = initScore + pins;
        assertEquals(expectedScore, endScore);
    }
}