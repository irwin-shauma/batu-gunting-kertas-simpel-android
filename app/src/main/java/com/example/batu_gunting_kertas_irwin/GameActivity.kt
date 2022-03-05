package com.example.batu_gunting_kertas_irwin

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GameActivity: AppCompatActivity() {

    lateinit var computerImageView: ImageView
    lateinit var rockImageButton: ImageButton
    lateinit var scissorImageButton: ImageButton
    lateinit var paperImageButton: ImageButton
    lateinit var hasilImageView: ImageView

    private fun initComponents(){
        computerImageView = findViewById(R.id.computerImageView)

        rockImageButton = findViewById(R.id.rockImageButton)
        scissorImageButton = findViewById(R.id.scissorImageButton)
        paperImageButton = findViewById(R.id.paperImageButton)

        hasilImageView = findViewById(R.id.hasilImageView)
    }

    private fun startGame(pilihan:String){
        val pilihanKomputer = Game.pilihOpsiRandom()
        computerImageView.setImageResource(Game.pilihDrawable(pilihanKomputer))

        when{
            Game.isDraw(pilihan, pilihanKomputer) -> hasilImageView.setImageResource(R.drawable.draw)
            Game.isWin(pilihan, pilihanKomputer) -> hasilImageView.setImageResource(R.drawable.win)
            else -> hasilImageView.setImageResource(R.drawable.lose)
        }

    }

    private fun initListener(){
        rockImageButton.setOnClickListener { startGame("BATU") }
        scissorImageButton.setOnClickListener { startGame("GUNTING") }
        paperImageButton.setOnClickListener { startGame("KERTAS") }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        initComponents()
        initListener()
    }

}