package com.jasonhuang.peelapart

import org.junit.Assert.*

import org.junit.Test

class WeatherManagerTest {

    @Test
    fun testGetTemperature() {
        var apikey: String = "8118ed6ee68db2debfaaa5a44c832918"
        var wClient = WeatherManager(apikey)
        println(wClient.getTemperature(-33.8679,151.22))
    }
}