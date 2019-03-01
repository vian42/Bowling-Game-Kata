package com.practice;

class BowlingGame {

    private Integer score = 0;

    Integer getScore() {
        return score;
    }

    void roll(Integer pins) {
        score += pins;
    }
}
