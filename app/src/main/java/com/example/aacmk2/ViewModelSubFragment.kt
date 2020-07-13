package com.example.aacmk2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.aacmk2.databinding.ViewModelSubFragmentBinding

class ViewModelSubFragment : Fragment() {

    private val parent by activityViewModels<ViewModelViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: ViewModelSubFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.view_model_sub_fragment, container, false)
        binding.parent = parent
        // !! 重要 !! (https://developer.android.com/topic/libraries/data-binding/architecture?hl=ja#livedata)
        // こいつがないとUIへデータ更新が通知されない
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

}