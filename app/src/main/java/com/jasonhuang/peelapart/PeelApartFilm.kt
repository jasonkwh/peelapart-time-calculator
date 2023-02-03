package com.jasonhuang.peelapart

class PeelApartFilm constructor(_temperatureArr: DoubleArray, _timeArr: IntArray): IPeelApartFilm {
    var temperatureArr: DoubleArray = _temperatureArr
    var timeArr: IntArray = _timeArr

    override fun last(): Pair<Double, Int> {
        if (isNotEmpty()) {
            return Pair(temperatureArr.last(), timeArr.last())
        }
        return Pair(0.0, 0)
    }

    override fun lastTemperature(): Double {
        if (isNotEmpty()) {
            return temperatureArr.last()
        }
        return 0.0
    }

    override fun lastTime(): Int {
        if (isNotEmpty()) {
            return timeArr.last()
        }
        return 0
    }

    override fun lastIndex(): Int {
        if (isNotEmpty()) {
            return temperatureArr.lastIndex
        }
        return 0
    }

    override fun first(): Pair<Double, Int> {
        if (isNotEmpty()) {
            return Pair(temperatureArr.first(), timeArr.first())
        }
        return Pair(0.0, 0)
    }

    override fun firstTemperature(): Double {
        if (isNotEmpty()) {
            return temperatureArr.first()
        }
        return 0.0
    }

    override fun firstTime(): Int {
        if (isNotEmpty()) {
            return timeArr.first()
        }
        return 0
    }

    override fun get(index: Int): Pair<Double, Int> {
        if (isNotEmpty()) {
            return Pair(temperatureArr[index], timeArr[index])
        }
        return Pair(0.0, 0)
    }

    override fun getTemperature(index: Int): Double {
        if (isNotEmpty()) {
            return temperatureArr[index]
        }
        return 0.0
    }

    override fun getTime(index: Int): Int {
        if (isNotEmpty()) {
            return timeArr[index]
        }
        return 0
    }

    override fun getTemperatureArr(): DoubleArray {
        return temperatureArr
    }

    override fun getTimeArr(): IntArray {
        return timeArr
    }

    private fun isNotEmpty(): Boolean {
        return (temperatureArr.size == timeArr.size && temperatureArr.isNotEmpty() && timeArr.isNotEmpty())
    }
}