package com.mlpadilla.rockpaperscissorskata

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.behaviorSpec
import io.kotest.matchers.shouldBe

class GameTest: BehaviorSpec({
    include(
        testPlay(
            playerGesture = Gesture.ROCK,
            opponentGesture = Gesture.SCISSORS,
            expectedWinner = Winner.PLAYER
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.ROCK,
            opponentGesture = Gesture.PAPER,
            expectedWinner = Winner.OPPONENT
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.ROCK,
            opponentGesture = Gesture.ROCK,
            expectedWinner = Winner.DRAW
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.SCISSORS,
            opponentGesture = Gesture.ROCK,
            expectedWinner = Winner.OPPONENT
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.SCISSORS,
            opponentGesture = Gesture.PAPER,
            expectedWinner = Winner.PLAYER
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.SCISSORS,
            opponentGesture = Gesture.SCISSORS,
            expectedWinner = Winner.DRAW
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.PAPER,
            opponentGesture = Gesture.SCISSORS,
            expectedWinner = Winner.OPPONENT
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.PAPER,
            opponentGesture = Gesture.ROCK,
            expectedWinner = Winner.PLAYER
        )
    )
    include(
        testPlay(
            playerGesture = Gesture.PAPER,
            opponentGesture = Gesture.PAPER,
            expectedWinner = Winner.DRAW
        )
    )
})

fun testPlay(
    playerGesture: Gesture,
    opponentGesture: Gesture,
    expectedWinner: Winner
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
                winner shouldBe expectedWinner
            }
        }

    }
}
