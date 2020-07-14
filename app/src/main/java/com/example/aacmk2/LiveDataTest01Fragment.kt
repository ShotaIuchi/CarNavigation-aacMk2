package com.example.aacmk2

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import kotlinx.coroutines.*

class LiveDataTest01Fragment : Fragment() {

    private val viewModel by viewModels<LiveDataTest01ViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("XXXXXXXXXXXXX", "[X1]")
        viewModel.list.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            Log.d("XXXXXXXXXXXXX", "[XXXX1]")
        })
        Log.d("XXXXXXXXXXXXX", "[X2]")

        Log.d("XXXXXXXXXXXXX", "[A1]")
        GlobalScope.launch(Dispatchers.Main) {
            Log.d("XXXXXXXXXXXXX", "[B1]")
            GlobalScope.launch(Dispatchers.Default) {
                Log.d("XXXXXXXXXXXXX", "[C1]${viewModel.data.data}")
                delay(2000)
                Log.d("XXXXXXXXXXXXX", "[C2]${viewModel.data.data}")
            }
            Log.d("XXXXXXXXXXXXX", "[B2]")
            withContext(Dispatchers.Default) {
                Log.d("XXXXXXXXXXXXX", "[D1]${viewModel.data.data}")
                delay(2000)
                Log.d("XXXXXXXXXXXXX", "[D2]${viewModel.data.data}")
            }
            Log.d("XXXXXXXXXXXXX", "[B3]")
        }
        Log.d("XXXXXXXXXXXXX", "[A2]")

        return inflater.inflate(R.layout.live_data_test01_fragment, container, false)
    }

}