package com.mncs.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mncs.repository.LeagueRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(
    private val leagueRepository: LeagueRepository,
) : ViewModel() {

    init {
        getPlayers()
    }

    fun getPlayers() {
        viewModelScope.launch {
            val response = leagueRepository.getLeagues(true)
            val x = 3
            val dx = 3
        }
    }
}