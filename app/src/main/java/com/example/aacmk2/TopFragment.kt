package com.example.aacmk2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.aacmk2.databinding.TopFragmentBinding

class TopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: TopFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.top_fragment, container, false)
        binding.data.setOnClickListener(Navigation.createNavigateOnClickListener(TopFragmentDirections.actionTopData()))
        binding.observable.setOnClickListener(Navigation.createNavigateOnClickListener(TopFragmentDirections.actionToObservable()))
        binding.liveData.setOnClickListener(Navigation.createNavigateOnClickListener(TopFragmentDirections.actionTopLiveData()))
        binding.viewModel.setOnClickListener(Navigation.createNavigateOnClickListener(TopFragmentDirections.actionTopViewModel()))
        return binding.root
    }

}