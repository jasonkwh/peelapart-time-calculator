package com.jasonhuang.peelapart

enum class PeelApartFilmType(val temperatures: DoubleArray, val times: IntArray) {
    FP100C(doubleArrayOf(10.0, 15.0, 20.0, 25.0, 30.0, 35.0), intArrayOf(270, 180, 120, 90, 75, 60)),
    FP3000B(doubleArrayOf(15.0, 17.0, 18.0, 19.0, 20.0, 23.0, 24.0, 35.0), intArrayOf(30, 30, 25, 25, 20, 20, 15, 15))
}