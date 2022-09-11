package ru.wert.normypik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logo: ImageView = findViewById(R.id.imageViewLogo);

        logo.setOnClickListener {
            val startApplication = Intent(this, StartActivity::class.java);
            startActivity(startApplication);
        }

    }
}