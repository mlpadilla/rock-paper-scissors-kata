package com.mlpadilla.rockpaperscissorskata

object Game {
    private val foo = setOf(
        Pair(Gesture.ROCK, Gesture.SCISSORS),
        Pair(Gesture.SCISSORS, Gesture.PAPER),
        Pair(Gesture.PAPER, Gesture.ROCK)
    )
    fun play(
        playerGesture: Gesture,
        opponentGesture: Gesture
    ): Player {
        return if (foo.contains(Pair(playerGesture, opponentGesture))) {
            Player.PLAYER
        } else {
            Player.OPPONENT
        }
    }
}
