package com.mlpadilla.rockpaperscissorskata

object Game {
    fun play(
        playerGesture: Gesture,
        opponentGesture: Gesture
    ): Player {
        return if (playerGesture == Gesture.ROCK && opponentGesture == Gesture.SCISSORS) {
            Player.PLAYER
        } else if (playerGesture == Gesture.SCISSORS && opponentGesture == Gesture.PAPER) {
            Player.PLAYER
        } else {
            Player.OPPONENT
        }
    }
}
