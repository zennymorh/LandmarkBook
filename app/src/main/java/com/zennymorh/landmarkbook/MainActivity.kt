package com.zennymorh.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var landmarkNames = ArrayList<String>()
        landmarkNames.add("London")
        landmarkNames.add("Eiffel")
        landmarkNames.add("Pisa")
        landmarkNames.add("Colosseum")

        val london = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.london)
        val eiffel = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.paris)
        val pisa = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.pisa)
        val colosseum = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.rome)

        val landmarkImages = ArrayList<Bitmap>()

        landmarkImages.add(london)
        landmarkImages.add(eiffel)
        landmarkImages.add(pisa)
        landmarkImages.add(colosseum)


        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, landmarkNames)

        listView.adapter = arrayAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val intent = Intent(applicationContext, DetailsActivity::class.java)
            intent.putExtra("name", landmarkNames[position])

            val bitmap = landmarkImages[position]

            val chosen = Globals.Chosen
            startActivity(intent)
        }
    }
}
