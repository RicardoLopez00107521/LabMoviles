package com.example.laboratorio04pdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.laboratorio04pdm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addListeners()
    }

    private fun addListeners(){
        binding.saveAction.setOnClickListener {
            val intent = Intent(this, ShareActivity::class.java)
            intent.putExtra(SHARE_NAME, binding.nameEditText.text.toString())
            intent.putExtra(SHARE_EMAIL, binding.emailEditText.text.toString())
            intent.putExtra(SHARE_PHONE, binding.phoneNumberEditText.text.toString())
            startActivity(intent)
        }
    }

    companion object{
        const val SHARE_NAME = "name"
        const val SHARE_EMAIL = "email"
        const val SHARE_PHONE = "phone"
    }
}