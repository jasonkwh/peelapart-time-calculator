package com.jasonhuang.peelapart

import org.junit.Assert.*

import org.junit.Test

class PeelApartTimeCalculatorTest {

    @Test
    fun testCalculate() {
        var film = PeelApartFilm(PeelApartFilmType.FP3000B)
        var calc = PeelApartTimeCalculator(16.1, film)
        println(calc.calculate())
    }
}