package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest{
    @Test
    fun generates_number() {
        val dice = MainActivity.Dice(6)
        val rollResult = dice.roll()
        assertTrue("Значення rollResult не між 1 і 6", rollResult in 1..6)
    }

}