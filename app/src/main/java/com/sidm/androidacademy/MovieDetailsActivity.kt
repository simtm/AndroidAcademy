package com.sidm.androidacademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE

        findViewById<ImageView>(R.id.btnBack).setOnClickListener {
            onBtnBackClick()
        }
        findViewById<TextView>(R.id.btnBackText).setOnClickListener {
            onBtnBackClick()
        }

        findViewById<TextView>(R.id.reviesCount).text = resources.getQuantityString(R.plurals.raiting_count, 125, 125)



//        To do this, use SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN. You may also need to use SYSTEM_UI_FLAG_LAYOUT_STABLE
    }

    private fun onBtnBackClick() {
        Toast.makeText(this, "on back btn click", Toast.LENGTH_SHORT).show()
    }
}