
package com.example.travelgo


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.travelgo.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Pastikan nama layout sesuai

        // Mendapatkan referensi tombol
        val buttonGetStart: Button = findViewById(R.id.buttonGetStart)

        // Menetapkan listener untuk tombol
        buttonGetStart.setOnClickListener {
            // Pindah ke DestinationActivity
            val intent = Intent(this, DestinationActivity::class.java)
            startActivity(intent)
        }
    }
}
