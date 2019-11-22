package com.zennymorh.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent = intent

        var name = intent.getStringExtra("name")
        textView.text = name

        val chosen = Globals.Chosen

        val selectedImage = Globals.returnImage()

        imageView.setImageBitmap(selectedImage)
    }
}
