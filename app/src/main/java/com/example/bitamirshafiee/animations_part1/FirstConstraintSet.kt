package com.example.bitamirshafiee.animations_part1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class FirstConstraintSet : AppCompatActivity() {

    private var showBigImage = false

    private val constraintSetNormal = ConstraintSet()

    private val constraintSetBig = ConstraintSet()

    private var rootLayout : ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_constraint_set)

        rootLayout = findViewById(R.id.start_animation)

        constraintSetNormal.clone(rootLayout!!)

        constraintSetBig.load(this@FirstConstraintSet, R.layout.first_constraint_set_end)

    }

    fun toggledMode(view: View){

        TransitionManager.beginDelayedTransition(rootLayout!!)

        showBigImage = !showBigImage

        applyConfig()

    }
    private fun applyConfig(){
        if (showBigImage){
            constraintSetBig.applyTo(rootLayout!!)
        }else{
            constraintSetNormal.applyTo(rootLayout!!)
        }
    }
}
