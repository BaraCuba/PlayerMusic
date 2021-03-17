package com.bignerdranch.android.mymusic.ui.tape

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TapeViewModel: ViewModel()  {

    private val _text = MutableLiveData<String>().apply {
        value = "This is tape Fragment"
    }
    val text: LiveData<String> = _text
}
