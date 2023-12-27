package com.example.restapi.ui.home.viewmodel

import com.example.restapi.model.Kontak
sealed class KontakUIState {
    data class Success(val kontak: List<Kontak>) : KontakUIState()
    object Error : KontakUIState()
    object Loading : KontakUIState()
}