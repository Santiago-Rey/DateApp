package com.example.friends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private fun IntArray.show(){
        print("[")
        for (i in this) print("$i ")
        println("]")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array2: IntArray = intArrayOf(1, 2, 3)
        println("array2: ")
        array2.show()
    }
}