package com.senyk.university.lab1.helpers

import android.text.TextWatcher

abstract class TextChangedListener : TextWatcher {
    override fun beforeTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) {
        return
    }

    override fun onTextChanged(text: CharSequence?, start: Int, count: Int, after: Int) {
        return
    }
}
