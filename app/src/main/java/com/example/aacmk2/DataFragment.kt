package com.example.aacmk2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.aacmk2.databinding.DataFragmentBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

class DataFragment : Fragment() {

    var me : DataData = DataData(Date().time.toString())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: DataFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.data_fragment, container, false)
        binding.me = me
        binding.update.setOnClickListener {
            me = DataData(Date().time.toString())
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