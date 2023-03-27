package com.example.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.roundToInt

private var contador: Double = 0.00

private lateinit var five_cents_image : ImageView
private lateinit var ten_cents_image : ImageView
private lateinit var quarter_cents : ImageView
private lateinit var one_dollar_cent : ImageView
private lateinit var money_text: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        ClickListener()
    }

    private fun ClickListener(){
        five_cents_image.setOnClickListener {
            contador += 0.05
            val round = (contador * 1000.0).roundToInt() / 1000.0
            money_text.text = round.toString()
        }

        ten_cents_image.setOnClickListener {
            contador += 0.10
            val round = (contador * 1000.0).roundToInt() / 1000.0
            money_text.text = round.toString()
        }

        quarter_cents.setOnClickListener {
            contador += 0.25
            val round = (contador * 1000.0).roundToInt() / 1000.0
            money_text.text = round.toString()
        }

        one_dollar_cent.setOnClickListener {
            contador += 1.00
            val round = (contador * 1000.0).roundToInt() / 1000.0
            money_text.text = round.toString()
        }
    }

    private fun bind(){
        five_cents_image = findViewById(R.id.five_cents_image_view)
        ten_cents_image = findViewById(R.id.ten_cents_image_view)
        quarter_cents = findViewById(R.id.twenty_five_cents_image_view)
        one_dollar_cent = findViewById(R.id.one_dollar_image_view)
        money_text = findViewById(R.id.counter_text_view)
    }
}