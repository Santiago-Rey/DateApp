package com.example.friends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class Details : AppCompatActivity() {

   private lateinit var image7 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        image7 = findViewById(R.id.img7)

        Picasso.get()
            .load("http://t1.gstatic.com/licensed-image?q=tbn:ANd9GcSY8PKG_0-Zk4xUSTTcXODTiuZ-ExtaDAuSBwIKeqbG79S4P25hKpu_mODvKMYQm_Ub")
            .into(image7)



    }
}
