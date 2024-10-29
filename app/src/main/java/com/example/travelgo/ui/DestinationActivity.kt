package com.example.travelgo

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DestinationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination) // Ensure this layout exists

        // Initialize destination holders
        val destinations = listOf(
            Pair(R.id.borobudurHolder, R.string.destination_name_borobudur),
            Pair(R.id.dufanHolder, R.string.destination_name_dufan),
            Pair(R.id.kalimantungHolder, R.string.destination_name_kalimantung),
            Pair(R.id.bajoHolder, R.string.destination_name_bajo),
            Pair(R.id.karangHolder, R.string.destination_name_karang)
        )


        for ((holderId, nameId) in destinations) {
            findViewById<LinearLayout>(holderId).setOnClickListener {
                val intent = Intent(this, DetailActivity::class.java).apply {
                    putExtra("destination_name", getString(nameId))
                    putExtra("destination_location", getString(getLocationId(nameId)))
                    putExtra("destination_description", getString(getDescriptionId(nameId)))
                    putExtra("destination_image", getImageId(nameId)) // Add this line here
                }
                startActivity(intent)
            }
        }

    }

    private fun getLocationId(nameId: Int): Int {
        return when (nameId) {
            R.string.destination_name_borobudur -> R.string.destination_location_borobudur
            R.string.destination_name_dufan -> R.string.destination_location_dufan
            R.string.destination_name_kalimantung -> R.string.destination_location_kalimantung
            R.string.destination_name_bajo -> R.string.destination_location_bajo
            R.string.destination_name_karang -> R.string.destination_location_karang
            else -> 0 // Fallback in case of an unexpected nameId
        }
    }

    private fun getDescriptionId(nameId: Int): Int {
        return when (nameId) {
            R.string.destination_name_borobudur -> R.string.destination_description_borobudur
            R.string.destination_name_dufan -> R.string.destination_description_dufan
            R.string.destination_name_kalimantung -> R.string.destination_description_kalimantung
            R.string.destination_name_bajo -> R.string.destination_description_bajo
            R.string.destination_name_karang -> R.string.destination_description_karang
            else -> 0 // Fallback in case of an unexpected nameId
        }
    }
    private fun getImageId(nameId: Int): Int {
        return when (nameId) {
            R.string.destination_name_borobudur -> R.drawable.candi_borobudur // Replace with your image resource
            R.string.destination_name_dufan -> R.drawable.dufan
            R.string.destination_name_kalimantung -> R.drawable.kalimantung
            R.string.destination_name_bajo -> R.drawable.labuan_bajo
            R.string.destination_name_karang -> R.drawable.karang
            else -> 0 // Fallback
        }
    }

}
