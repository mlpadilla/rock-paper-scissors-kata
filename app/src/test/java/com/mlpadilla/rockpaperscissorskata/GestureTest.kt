package com.mlpadilla.rockpaperscissorskata

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class GestureTest: BehaviorSpec({
    given("a gesture") {
        then("it can be of three kinds") {
            Gesture.values().size shouldBe 3
        }
        then("one kind is 'rock'") {
            Gesture.values().contains(Gesture.ROCK)
        }
        then("one kind is 'paper'") {
            Gesture.values().contains(Gesture.PAPER)
        }
        then("one kind is 'scissors'") {
            Gesture.values().contains(Gesture.SCISSORS)
        }
    }
})
