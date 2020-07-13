package com.example.aacmk2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class ViewModelViewModel : ViewModel() {

    var data = MutableLiveData(Date().time.toString())

}