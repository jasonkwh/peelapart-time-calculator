package com.jasonhuang.peelapart

interface IPeelApartFilm {
    fun last(): Pair<Double, Int>

    fun lastTemperature(): Double

    fun lastTime(): Int

    fun lastIndex(): Int

    fun first(): Pair<Double, Int>

    fun firstTemperature(): Double

    fun firstTime(): Int

    fun get(index: Int): Pair<Double, Int>

    fun getTemperature(index: Int): Double

    fun getTime(index: Int): Int

    fun getTemperatureArr(): DoubleArray

    fun getTimeArr(): IntArray
}