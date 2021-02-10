package com.example.bitamirshafiee.animations_part1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun constraintSetFirstExample(view : View){
        startActivity(Intent(this@MainActivity, FirstConstraintSet::class.java))
    }
    fun constraintSetSecondExample(view: View){
        startActivity(Intent(this@MainActivity , SecondConstraintSet::class.java))
    }
    fun placeHolderExample(view: View){
        startActivity(Intent(this@MainActivity , PlaceHolderExample::class.java))
    }
    fun circlePositioning(view: View){
        startActivity(Intent(this@MainActivity , CircularPositioning::class.java))
    }
}
