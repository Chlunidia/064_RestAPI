package com.example.restapi.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.restapi.KontakApplication
import com.example.restapi.ui.home.viewmodel.HomeViewModel
import com.example.restapi.ui.kontak.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(apkikasiKontak().container.kontakRepository)
        }
        initializer {
            InsertViewModel(apkikasiKontak().container.kontakRepository)
        }
    }
}

fun CreationExtras.apkikasiKontak(): KontakApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakApplication)