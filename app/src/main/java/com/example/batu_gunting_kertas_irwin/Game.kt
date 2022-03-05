package com.example.batu_gunting_kertas_irwin

import kotlin.random.Random

object Game {

    private val aturan = mapOf(
        "BATU-GUNTING" to true,
        "BATU-KERTAS" to false,
        "GUNTING-KERTAS" to true,
        "GUNTING-BATU" to false,
        "KERTAS-BATU" to true,
        "KERTAS-GUNTING" to false,

    )

    private val pilihan = listOf("BATU", "GUNTING", "KERTAS")

    private val pilihanDrawable = mapOf(
        "BATU" to R.drawable.rock,
        "GUNTING" to R.drawable.scissors,
        "KERTAS" to R.drawable.paper,
    )

    fun pilihOpsiRandom():String = pilihan[Random.nextInt(0,3)]

    fun pilihDrawable(option:String) : Int = pilihanDrawable[option]!!

    fun isDraw(from:String, to: String):Boolean = from == to

    fun isWin(from:String, to:String): Boolean = aturan["$from-$to"]!!


}