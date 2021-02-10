package com.example.bitamirshafiee.animations_part1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.util.Log
import android.view.View
import android.view.animation.AnticipateOvershootInterpolator
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class SecondConstraintSet : AppCompatActivity() {

    companion object {
        private const val TAG = "ConstraintSetTwo"
    }

    private var showBigImage = false

    private var rootLayout : ConstraintLayout? = null

    private val constraintSetNormal = ConstraintSet()

    private val constraintSetBig = ConstraintSet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_constraint_set)

        rootLayout = findViewById(R.id.second_constraint_set)

        constraintSetNormal.clone(rootLayout!!)

        constraintSetBig.load(this@SecondConstraintSet, R.layout.activity_second_constraint_set_end)
    }


    fun toggledMode(view : View){

        val transition = ChangeBounds()

        transition.interpolator = AnticipateOvershootInterpolator(1.0f)
        transition.duration = 1200

        TransitionManager.beginDelayedTransition(rootLayout!!, transition)

        showBigImage = !showBigImage

        applyConfig()
    }

    private fun applyConfig(){
        if (showBigImage){
            Log.d(TAG,"big")
            constraintSetBig.applyTo(rootLayout!!)
        }else{
            Log.d(TAG,"small")
            constraintSetNormal.applyTo(rootLayout!!)
        }
    }
}
