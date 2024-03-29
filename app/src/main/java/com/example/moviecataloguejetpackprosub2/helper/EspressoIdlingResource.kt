package com.example.moviecataloguejetpackprosub2.helper

import androidx.test.espresso.IdlingResource
import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResource {
    private const val RESOURCE = "GLOBAL"

    private val espressoTestIdlingResource = CountingIdlingResource(
        RESOURCE
    )
    fun increment(){
        espressoTestIdlingResource.increment()
    }
    fun decrement(){
        espressoTestIdlingResource.decrement()

    }

    fun getEspressoIdlingResource(): IdlingResource? {
        return espressoTestIdlingResource
    }
}