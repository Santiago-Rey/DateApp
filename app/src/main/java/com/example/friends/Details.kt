package com.example.friends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class Details : AppCompatActivity() {

    private  lateinit var img1 : ImageView
    private  lateinit var img2 : ImageView
    private  lateinit var img3 : ImageView
    private  lateinit var img4 : ImageView
    private  lateinit var img5 : ImageView
    private  lateinit var img6 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        this.img1 = findViewById(R.id.img1)
        this.img2 = findViewById(R.id.img2)
        this.img3 = findViewById(R.id.img3)
        this.img4 = findViewById(R.id.img4)
        this.img5 = findViewById(R.id.img5)
        this.img6 = findViewById(R.id.img6)

        Picasso.get()
            .load("http://www.martystepp.com/dogs/daisy-01.jpg")
            .into(img1)

    }
}