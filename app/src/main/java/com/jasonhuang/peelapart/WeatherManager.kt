package com.jasonhuang.peelapart

import java.net.URL
import org.json.JSONObject

class WeatherManager constructor(_apikey: String): IWeatherManager {
    var apikey : String = _apikey

    override fun getTemperature(lat: Double, lon: Double): Double {
        var response:String
        return try{
            response = URL("https://api.openweathermap.org/data/2.5/weather?lat=$lat&lon=$lon&units=metric&appid=$apikey").readText(
                Charsets.UTF_8
            )
            extractDegrees(response)
        }catch (e: Exception){
            e.printStackTrace()
            0.0
        }
    }

    private fun extractDegrees(result: String): Double {
        return try {
            /* Extracting JSON returns from the API */
            val jsonObj = JSONObject(result)
            val main = jsonObj.getJSONObject("main")
            main.getDouble("feels_like")
        } catch (e: Exception) {
            e.printStackTrace()
            0.0
        }
    }
}