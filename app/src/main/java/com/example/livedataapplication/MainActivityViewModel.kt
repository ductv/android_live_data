package com.example.livedataapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingCount : Int) : ViewModel() {

    private var count = MutableLiveData<Int>()
    val countValue : LiveData<Int>
        get() = count

    init {
        count.value = startingCount
    }

    fun updateCount(){
        count.value = (count.value)?.plus(1)
    }
}