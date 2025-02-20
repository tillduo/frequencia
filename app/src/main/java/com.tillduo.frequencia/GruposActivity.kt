package com.tillduo.frequencia

import android.content.Intent
import android.graphics.Camera
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_grupos.*

class GruposActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_grupos)

        imNovo.setOnClickListener{
            startActivity(Intent(this, CameraActivity::class.java))
            finish()
        }

        imVoltar.setOnClickListener{
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
