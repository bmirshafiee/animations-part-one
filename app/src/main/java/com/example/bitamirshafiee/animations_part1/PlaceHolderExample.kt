package com.example.bitamirshafiee.animations_part1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.OvershootInterpolator
import kotlinx.android.synthetic.main.activity_place_holder.*

class PlaceHolderExample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_holder)
    }

    fun answerNAction(view : View){
        setPlaceHolder(R.id.answerN)

    }
    fun answerOAction(view : View){
        setPlaceHolder(R.id.answerO)
    }
    fun answerPAction(view : View){
        setPlaceHolder(R.id.answerP)
    }
    fun answerQAction(view : View){
        setPlaceHolder(R.id.answerQ)
    }

    private fun setPlaceHolder(id : Int){
        val transition = ChangeBounds()
        transition.interpolator = OvershootInterpolator()
        transition.duration = 400
        TransitionManager.beginDelayedTransition(constraintLayout_placeHolder, transition)
        placeHolder.setContentId(id)

    }
}
