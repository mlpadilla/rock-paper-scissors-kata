package com.mlpadilla.rockpaperscissorskata

object Game {
    private val playerWinningGestureCombinations = setOf(
        Pair(Gesture.ROCK, Gesture.SCISSORS),
        Pair(Gesture.SCISSORS, Gesture.PAPER),
        Pair(Gesture.PAPER, Gesture.ROCK)
    )
    fun play(
        playerGesture: Gesture,
        opponentGesture: Gesture
    ): Player {
        if (playerGesture == Gesture.ROCK && opponentGesture == Gesture.ROCK) {
            return Player.DRAW
        }

        return when (playerWinningGestureCombinations.contains(Pair(playerGesture, opponentGesture))) {
            true -> Player.PLAYER
            false -> Player.OPPONENT
        }
    }
}
