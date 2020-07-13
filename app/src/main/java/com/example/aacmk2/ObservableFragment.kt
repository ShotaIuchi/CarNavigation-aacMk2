package com.example.aacmk2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.aacmk2.databinding.ObservableFragmentBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

class ObservableFragment : Fragment() {

    var me = ObservableData()
    init {
        me.date.set(Date().time.toString())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: ObservableFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.observable_fragment, container, false)
        binding.me = me
        binding.update.setOnClickListener {
            me.date.set(Date().time.toString())
        }
        binding.back.setOnClickListener {
            GlobalScope.launch {
                delay(3000)
                binding.root.findNavController().popBackStack()
            }
        }
        return binding.root
    }

}