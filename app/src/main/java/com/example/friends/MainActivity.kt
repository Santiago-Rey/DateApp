package com.example.friends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    private  lateinit var image1 : ImageView
    private  lateinit var image2 : ImageView
    private  lateinit var image3 : ImageView
    private  lateinit var image4 : ImageView
    private  lateinit var image5 : ImageView
    private  lateinit var image6 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image1 = findViewById(R.id.img1)
        image2 = findViewById(R.id.img2)
        image3 = findViewById(R.id.img3)
        image4 = findViewById(R.id.img4)
        image5 = findViewById(R.id.img5)
        image6 = findViewById(R.id.img6)

        image1.setOnClickListener{
            img1()
        }

        images()

    }


    fun img1(){

        val intent : Intent = Intent(this, Details::class.java)
        startActivity(intent)

    }

    fun images(){
        Picasso.get()
            .load("http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcSY8PKG_0-Zk4xUSTTcXODTiuZ-ExtaDAuSBwIKeqbG79S4P25hKpu_mODvKMYQm_Ub")
            .into(image1)

        Picasso.get()
            .load("https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcR3cIIy8-KIAFrEMnIpQRey1WCLrLHu1oU80LVL3qWAlmtK5UqXHyyVAHzuCQ&s=19")
            .into(image2)

        Picasso.get()
            .load("https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTq1L4dhesse52WMeq8zwzC4tVRYVHNwoS-w8Fv5HPbwZkGJu17WJryfOGQ&s=19")
            .into(image3)

        Picasso.get()
            .load("https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcTB3uX4bkmaNZmIXIPgAtAWzAO48ZOkSr4XVTlpIQfkZv9CemU0YYY4VF58&s=19")
            .into(image4)

        Picasso.get()
            .load("https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcRTb8XndRFVUY6AL2zp0T6hX4hF-BACVn9_eT7pdI_CDsS10YJc8GQ3Neb7Bg&s=19")
            .into(image5)

        Picasso.get()
            .load("https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQLO6aVUf3bnGXSemMkdQs5nfyFMvXIjCTJYZNqHVOqAUo4sa2MQMbO7SVbSQ&s=19")
            .into(image6)

    }


}