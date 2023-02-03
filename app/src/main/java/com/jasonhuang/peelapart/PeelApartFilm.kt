package com.jasonhuang.peelapart

class PeelApartFilm constructor(_filmType: PeelApartFilmType): IPeelApartFilm {
    var filmType: PeelApartFilmType = _filmType

    override fun last(): Pair<Double, Int> {
        if (isNotEmpty()) {
            return Pair(filmType.temperatures.last(), filmType.times.last())
        }
        return Pair(0.0, 0)
    }

    override fun lastTemperature(): Double {
        if (isNotEmpty()) {
            return filmType.temperatures.last()
        }
        return 0.0
    }

    override fun lastTime(): Int {
        if (isNotEmpty()) {
            return filmType.times.last()
        }
        return 0
    }

    override fun lastIndex(): Int {
        if (isNotEmpty()) {
            return filmType.temperatures.lastIndex
        }
        return 0
    }

    override fun first(): Pair<Double, Int> {
        if (isNotEmpty()) {
            return Pair(filmType.temperatures.first(), filmType.times.first())
        }
        return Pair(0.0, 0)
    }

    override fun firstTemperature(): Double {
        if (isNotEmpty()) {
            return filmType.temperatures.first()
        }
        return 0.0
    }

    override fun firstTime(): Int {
        if (isNotEmpty()) {
            return filmType.times.first()
        }
        return 0
    }

    override fun get(index: Int): Pair<Double, Int> {
        if (isNotEmpty()) {
            return Pair(filmType.temperatures[index], filmType.times[index])
        }
        return Pair(0.0, 0)
    }

    override fun getTemperature(index: Int): Double {
        if (isNotEmpty()) {
            return filmType.temperatures[index]
        }
        return 0.0
    }

    override fun getTime(index: Int): Int {
        if (isNotEmpty()) {
            return filmType.times[index]
        }
        return 0
    }

    override fun getTemperatures(): DoubleArray {
        return filmType.temperatures
    }

    override fun getTimes(): IntArray {
        return filmType.times
    }

    private fun isNotEmpty(): Boolean {
        return (filmType.temperatures.size == filmType.times.size && filmType.temperatures.isNotEmpty() && filmType.times.isNotEmpty())
    }
}