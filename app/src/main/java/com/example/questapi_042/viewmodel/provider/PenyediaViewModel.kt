package com.example.questapi_042.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.questapi_042.repositori.AplikasiDataSiswa
import com.example.questapi_042.viewmodel.DetailViewModel
import com.example.questapi_042.viewmodel.EditViewModel
import com.example.questapi_042.viewmodel.EntryViewModel
import com.example.questapi_042.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa():AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as
                AplikasiDataSiswa
        )

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container
            .repositoriDataSiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container
            .repositoriDataSiswa) }
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().container.repositoriDataSiswa
            )
        }

    }
}