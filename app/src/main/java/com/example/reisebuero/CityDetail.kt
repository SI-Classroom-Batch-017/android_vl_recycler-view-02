package com.example.reisebuero

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.reisebuero.databinding.ActivityCityDetailBinding

class CityDetail : AppCompatActivity() {
    private lateinit var vb: ActivityCityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("LOG_DEBUG", "CityDetail onCreate")
        vb = ActivityCityDetailBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(vb.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cityName = intent.extras?.getString("HEX_HEX")
        val cityImageRes = intent.extras?.getInt("CITY_IMAGE_RES")

        vb.tvCityName.text = cityName

        if (cityImageRes != null) {
            vb.ivCityName.setImageResource(cityImageRes)
        }

        vb.btShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Hier schau doch mal was für eine mega City: $cityName")
            intent.type = "text/plain"

            val shareIntent = Intent.createChooser(intent, null)
            startActivity(shareIntent)
        }
    }
}