package com.mncs.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

abstract class BaseViewModel<VS, A> : ViewModel() {

    abstract val initialViewState: VS

    private val _viewState: MutableStateFlow<VS> by lazy { MutableStateFlow(initialViewState) }
    val viewState: StateFlow<VS> get() = _viewState

    private val _action: MutableSharedFlow<A> = MutableSharedFlow()
    protected val action: SharedFlow<A> get() = _action

    protected abstract suspend fun handleAction(action: A)

    protected fun setViewState(viewState: VS) {
        viewModelScope.launch {
            _viewState.emit(viewState)
        }
    }

    fun setAction(action: A) {
        viewModelScope.launch {
            _action.emit(action)
        }
    }

    private fun collectActions() {
        viewModelScope.launch {
            _action.collect(::handleAction)
        }
    }

    init {
        collectActions()
    }
}
