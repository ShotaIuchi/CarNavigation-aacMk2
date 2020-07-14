package com.example.aacmk2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

class LiveDataTest01ViewModel : ViewModel() {

    data class Data01(public val data:String)

    val data: Data01 by lazy {
        Data01(Date().time.toString()).also {
            Thread.sleep(1000)
        }
    }

    lateinit var list: LiveData<List<String>>

    init {
        viewModelScope.launch {
            list = delayFunc()
        }
    }

    suspend fun delayFunc(): LiveData<List<String>> = withContext(Dispatchers.Default) {
        val r = ArrayList<String>()
        r.apply {
            add("STR1")
            add("STR2")
            add("STR3")
        }
        delay(2000)
        return@withContext MutableLiveData<List<String>>(r)
    }

}

