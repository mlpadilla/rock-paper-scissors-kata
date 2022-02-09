package com.mlpadilla.rockpaperscissorskata

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class GameTest: BehaviorSpec({
    given("a player with gesture 'rock'") {
        val playerGesture = Gesture.ROCK
        and("an opponent with gesture 'scissors'") {
            val opponentGesture = Gesture.SCISSORS
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("the player wins") {
                    winner shouldBe Winner.PLAYER
                }
            }
        }
        and("an opponent with gesture 'paper'") {
            val opponentGesture = Gesture.PAPER
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("the opponent wins") {
                    winner shouldBe Winner.OPPONENT
                }
            }
        }
        and("an opponent with gesture 'rock'") {
            val opponentGesture = Gesture.ROCK
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("it's a draw") {
                    winner shouldBe Winner.DRAW
                }
            }
        }
    }

    given("a player with gesture 'scissors'") {
        val playerGesture = Gesture.SCISSORS
        and("an opponent with gesture 'rock'") {
            val opponentGesture = Gesture.ROCK
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("the opponent wins") {
                    winner shouldBe Winner.OPPONENT
                }
            }
        }
        and("an opponent with gesture 'paper'") {
            val opponentGesture = Gesture.PAPER
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("the player wins") {
                    winner shouldBe Winner.PLAYER
                }
            }
        }
        and("an opponent with gesture 'scissors'") {
            val opponentGesture = Gesture.SCISSORS
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("it's a draw") {
                    winner shouldBe Winner.DRAW
                }
            }
        }
    }

    given("a player with gesture 'paper'") {
        val playerGesture = Gesture.PAPER
        and("an opponent with gesture 'scissors'") {
            val opponentGesture = Gesture.SCISSORS
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("the opponent wins") {
                    winner shouldBe Winner.OPPONENT
                }
            }
        }
        and("an opponent with gesture 'rock'") {
            val opponentGesture = Gesture.ROCK
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("the player wins") {
                    winner shouldBe Winner.PLAYER
                }
            }
        }
        and("an opponent with gesture 'paper'") {
            val opponentGesture = Gesture.PAPER
            `when`("playing") {
                val winner = Game.play(
                    playerGesture = playerGesture,
                    opponentGesture = opponentGesture
                )
                then("it's a draw") {
                    winner shouldBe Winner.DRAW
                }
            }
        }
    }
})
