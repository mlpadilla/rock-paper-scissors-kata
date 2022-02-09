package com.mlpadilla.rockpaperscissorskata

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class GameTest: BehaviorSpec({
    given("a player with gesture 'rock'") {
        val playerGesture = Gesture.ROCK
        and("an opponent with gesture 'scissors'") {
            val opponentGesture = Gesture.SCISSORS
            `when`("playing") {
                then("the player wins") {
                    Game.play(
                        playerGesture = playerGesture,
                        opponentGesture = opponentGesture
                    ) shouldBe Player.PLAYER
                }
            }
        }
    }

    given("a player with gesture 'scissors'") {
        val playerGesture = Gesture.SCISSORS
        and("an opponent with gesture 'rock'") {
            val opponentGesture = Gesture.ROCK
            `when`("playing") {
                then("the opponent wins") {
                    Game.play(
                        playerGesture = playerGesture,
                        opponentGesture = opponentGesture
                    ) shouldBe Player.OPPONENT
                }
            }
        }
    }
})
