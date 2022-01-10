package com.mncs.home

import com.mncs.base.BaseViewModel
import com.mncs.home.HomeViewModel.Action
import com.mncs.home.HomeViewModel.ViewState
import com.mncs.preferences.definition.PreferencesManager
import com.mncs.repository.LeagueRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val preferencesManager: PreferencesManager,
    private val leagueRepository: LeagueRepository,
) : BaseViewModel<ViewState, Action>() {

    override val initialViewState: ViewState = ViewState.Loading

    override suspend fun handleAction(action: Action) {
        when (action) {
            is Action.Initialize, is Action.Refresh -> {
                loadData()
            }
        }
    }

    private suspend fun loadData() {
        val selectedLeagueId = preferencesManager.get(SelectedLeagueIdKey, "")

        if (selectedLeagueId.isNotBlank()) {
            setViewState(ViewState.Content(selectedLeagueId = selectedLeagueId))
        } else {
            val leagues = leagueRepository.getLeagues(forceRemote = true)

            if (leagues.isNotEmpty()) {
                val firstLeagueId = leagues.first().id
                preferencesManager.put(SelectedLeagueIdKey, firstLeagueId)
                setViewState(ViewState.Content(selectedLeagueId = firstLeagueId))
            } else {
                Timber.e("empty league list")
                setViewState(ViewState.Error)
            }
        }
    }

    sealed class ViewState {
        object Loading : ViewState()
        data class Content(
            val selectedLeagueId: String,
        ) : ViewState()
        object Error : ViewState()
    }

    sealed class Action {
        object Initialize : Action()
        object Refresh : Action()
    }

    companion object {
        private const val SelectedLeagueIdKey = "selected_league_id"
    }
}
