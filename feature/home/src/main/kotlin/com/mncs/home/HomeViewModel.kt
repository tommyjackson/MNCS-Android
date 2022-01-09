package com.mncs.home

import com.mncs.base.BaseViewModel
import com.mncs.data.HomeCellData
import com.mncs.home.HomeViewModel.Action
import com.mncs.home.HomeViewModel.ViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel<ViewState, Action>() {

    override val initialViewState: ViewState = ViewState.Loading

    override suspend fun handleAction(action: Action) {
        when (action) {
            is Action.Initialize, is Action.Refresh -> {
                loadData()
            }
        }
    }

    private suspend fun loadData() {

    }

    sealed class ViewState {
        object Loading : ViewState()
        data class Content(
            val cells: List<HomeCellData>,
        ) : ViewState()
        object Error : ViewState()
    }

    sealed class Action {
        object Initialize : Action()
        object Refresh : Action()
    }
}