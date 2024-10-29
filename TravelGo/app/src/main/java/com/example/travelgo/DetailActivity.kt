package com.example.travelgo

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val destinationName = intent.getStringExtra("destination_name")
        val destinationLocation = intent.getStringExtra("destination_location")
        val destinationDescription = intent.getStringExtra("destination_description")
        val destinationImageId = intent.getIntExtra("destination_image", 0)

        // Set the data to the views
        findViewById<TextView>(R.id.textDestinationName).text = destinationName
        findViewById<TextView>(R.id.textDestinationLocation).text = destinationLocation
        findViewById<TextView>(R.id.textDestinationDescription).text = destinationDescription

        // Set the image if available
        if (destinationImageId != 0) {
            findViewById<ImageView>(R.id.destinationImage).setImageResource(destinationImageId)
        }
    }
}

