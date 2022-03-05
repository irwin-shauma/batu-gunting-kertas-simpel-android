package com.example.batu_gunting_kertas_irwin

import org.junit.Assert
import org.junit.Test

class GameTest {

    @Test
    fun testPickRandomOption() {
        val pilihan = listOf("BATU", "GUNTING", "KERTAS")
        Assert.assertTrue(pilihan.contains(Game.pilihOpsiRandom()))
        Assert.assertTrue(pilihan.contains(Game.pilihOpsiRandom()))
        Assert.assertTrue(pilihan.contains(Game.pilihOpsiRandom()))
        Assert.assertTrue(pilihan.contains(Game.pilihOpsiRandom()))
        Assert.assertTrue(pilihan.contains(Game.pilihOpsiRandom()))
    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.rock, Game.pilihDrawable("BATU"))
        Assert.assertEquals(R.drawable.scissors, Game.pilihDrawable("GUNTING"))
        Assert.assertEquals(R.drawable.paper, Game.pilihDrawable("KERTAS"))
    }

    @Test
    fun testIsDraw() {
        Assert.assertTrue(Game.isDraw("BATU", "BATU"))
        Assert.assertTrue(Game.isDraw("GUNTING", "GUNTING"))
        Assert.assertTrue(Game.isDraw("KERTAS", "KERTAS"))

        Assert.assertFalse(Game.isDraw("BATU", "KERTAS"))
        Assert.assertFalse(Game.isDraw("GUNTING", "BATU"))
        Assert.assertFalse(Game.isDraw("KERTAS", "GUNTING"))
    }

    @Test
    fun testIsWin() {
        Assert.assertTrue(Game.isWin("BATU", "GUNTING"))
        Assert.assertTrue(Game.isWin("GUNTING", "KERTAS"))
        Assert.assertTrue(Game.isWin("KERTAS", "BATU"))

        Assert.assertFalse(Game.isWin("BATU", "KERTAS"))
        Assert.assertFalse(Game.isWin("GUNTING", "BATU"))
        Assert.assertFalse(Game.isWin("KERTAS", "GUNTING"))
    }
}