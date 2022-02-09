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
    ): Winner =
        when {
            playerGesture == opponentGesture -> Winner.DRAW
            playerWinningGestureCombinations.contains(
                Pair(playerGesture, opponentGesture)
            ) -> Winner.PLAYER
            else -> Winner.OPPONENT
        }
}
