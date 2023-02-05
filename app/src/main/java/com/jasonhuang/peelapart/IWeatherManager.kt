package com.jasonhuang.peelapart

interface IWeatherManager {
    fun getTemperature(lat: Double, lon: Double): Double
}