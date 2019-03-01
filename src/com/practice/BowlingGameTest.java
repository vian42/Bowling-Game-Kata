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
    public void no_bonus_point_when_no_spare_and_no_strike() {
        Integer pinsFirstTry = 5;
        Integer pinsSecondTry = 3;
        Integer initScore = game.getScore();
        game.roll(pinsFirstTry);
        game.roll(pinsSecondTry);
        Integer endScore = game.getScore();
        Integer expectedScore = initScore + pinsFirstTry + pinsSecondTry;
        assertEquals(expectedScore, endScore);
    }

    @Test
    public void name() {
        Integer pinsFirstTryFirstFrame = 7;
        Integer pinsSecondTryFirstFrame = 3;
        Integer pinsFirstTrySecondFrame = 4;
        Integer initScore = game.getScore();
        game.roll(pinsFirstTryFirstFrame);
        game.roll(pinsSecondTryFirstFrame);
        game.roll(pinsFirstTrySecondFrame);
        Integer endScore = game.getScore();
        Integer expectedScore = initScore + pinsFirstTryFirstFrame + pinsSecondTryFirstFrame + 2 * pinsFirstTrySecondFrame;
        assertEquals(expectedScore,endScore);
    }
}