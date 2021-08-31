package com.app_devs.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel(val initalValue:Int):ViewModel() {
    var number=initalValue;
    fun addOne()
    {
        number++
    }
}