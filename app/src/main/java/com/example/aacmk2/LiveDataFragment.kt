package com.example.aacmk2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.aacmk2.databinding.LiveDataFragmentBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

class LiveDataFragment : Fragment() {

    private val me = LiveDataData()
    private var canBack = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: LiveDataFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.live_data_fragment, container, false)
        binding.me = me
        binding.update.setOnClickListener {
            me.data.postValue(Date().time.toString())
        }
        binding.back.setOnClickListener {
            GlobalScope.launch {
                delay(3000)
                canBack = true
                me.data.postValue(Date().time.toString())
            }
        }
        me.data.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (canBack) {
                binding.root.findNavController().popBackStack()
            }
        })
        // !! 重要 !! (https://developer.android.com/topic/libraries/data-binding/architecture?hl=ja#livedata)
        // こいつがないとUIへデータ更新が通知されない
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

}