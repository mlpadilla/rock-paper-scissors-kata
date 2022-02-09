package com.mlpadilla.rockpaperscissorskata

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.behaviorSpec
import io.kotest.matchers.shouldBe

class GameTest: BehaviorSpec({
    include(
        testPlay(
            playerGesture = Gesture.ROCK,
            opponentGesture = Gesture.SCISSORS,
            winner = Winner.PLAYER
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.ROCK,
            opponentGesture = Gesture.PAPER,
            winner = Winner.OPPONENT
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.ROCK,
            opponentGesture = Gesture.ROCK,
            winner = Winner.DRAW
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.SCISSORS,
            opponentGesture = Gesture.ROCK,
            winner = Winner.OPPONENT
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.SCISSORS,
            opponentGesture = Gesture.PAPER,
            winner = Winner.PLAYER
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.SCISSORS,
            opponentGesture = Gesture.SCISSORS,
            winner = Winner.DRAW
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.PAPER,
            opponentGesture = Gesture.SCISSORS,
            winner = Winner.OPPONENT
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.PAPER,
            opponentGesture = Gesture.ROCK,
            winner = Winner.PLAYER
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.PAPER,
            opponentGesture = Gesture.PAPER,
            winner = Winner.DRAW
        )
    )
})

fun testPlay(
    playerGesture: Gesture,
    opponentGesture: Gesture,
    winner: Winner
) = behaviorSpec {
    given("a player with gesture '${playerGesture.name}' AND an opponent with gesture '${opponentGesture.name}'") {
        val playerGesture = playerGesture

        val opponentGesture = opponentGesture
        `when`("playing") {
            val winner = Game.play(
                playerGesture = playerGesture,
                opponentGesture = opponentGesture
            )
            then("the winner is: '${winner.name}'") {
                winner shouldBe winner
            }
        }

    }
}
