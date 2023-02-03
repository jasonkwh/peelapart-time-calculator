package com.jasonhuang.peelapart

import kotlin.math.roundToInt

class PeelApartTimeCalculator constructor(_temperature: Double, _film: IPeelApartFilm): IPeelApartTimeCalculator {
    //var temperatureArr: DoubleArray = doubleArrayOf(10.0, 15.0, 20.0, 25.0, 30.0, 35.0)
    //var timeArr: IntArray = intArrayOf(270, 180, 120, 90, 75, 60)
    var film = _film
    var temperature = _temperature

    override fun calculate(): Int {
        if (temperature.roundToInt() > film.lastTemperature().toInt() || temperature.roundToInt() < film.firstTemperature().toInt()) {
            return 0
        }

        var time: Int = film.lastTime()

        for ((index, value) in film.getTemperatureArr().withIndex()) {
            // get closest time directly
            if (temperature.roundToInt() == value.toInt()) {
                return film.getTime(index)
            } else {
                if (index != film.lastIndex()) {
                    if (temperature > value && temperature < film.getTemperature(index+1)) {
                        time = getTime(temperature, index, index+1)
                    }
                }
            }
        }

        return time
    }

    private fun getTime(temperature: Double, firstIndex: Int, secondIndex: Int): Int {
        var (firstVal, firstTimeVal) = film.get(firstIndex)
        var (secondVal, secondTimeVal) = film.get(secondIndex)

        var gapPrc = (temperature - firstVal) / (secondVal - firstVal)
        var tempTime: Double = ((firstTimeVal - secondTimeVal) * gapPrc) + secondTimeVal

        return tempTime.roundToInt()
    }
}