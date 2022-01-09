package com.mncs.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mncs.repository.MncsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(
    private val mncsRepository: MncsRepository,
) : ViewModel() {

    init {
        getPlayers()
    }

    fun getPlayers() {
        viewModelScope.launch {
            val response = mncsRepository.getLeagues()
            val x = 3
            val dx = 3
        }
    }
}