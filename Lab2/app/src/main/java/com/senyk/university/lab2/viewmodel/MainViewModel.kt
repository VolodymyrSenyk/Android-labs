package com.senyk.university.lab2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.senyk.university.lab2.helper.SingleEventLiveData

class MainViewModel : ViewModel() {
    private var _crowsCount = SingleEventLiveData<Int>()
    val crowsCount: LiveData<Int>
        get() = _crowsCount

    private var _catsCount = SingleEventLiveData<Int>()
    val catsCount: LiveData<Int>
        get() = _catsCount

    fun crowsButtonPressed() {
        if (crowsCount.value != null) {
            _crowsCount.setValue(crowsCount.value?.plus(COUNTER_INCREMENTATION)!!)
        } else {
            _crowsCount.setValue(COUNTER_INCREMENTATION)
        }
    }

    fun catsButtonPressed() {
        if (_catsCount.value != null) {
            _catsCount.setValue(catsCount.value?.plus(COUNTER_INCREMENTATION)!!)
        } else {
            _catsCount.setValue(COUNTER_INCREMENTATION)
        }
    }

    companion object {
        const val COUNTER_INCREMENTATION = 1
    }
}
