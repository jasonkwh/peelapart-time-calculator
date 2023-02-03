package com.jasonhuang.peelapart

import org.junit.Assert.*

import org.junit.Test

class PeelApartTimeCalculatorTest {

    @Test
    fun testCalculate() {
        var calc = PeelApartTimeCalculator(9.5)
        println(calc.calculate())
    }
}