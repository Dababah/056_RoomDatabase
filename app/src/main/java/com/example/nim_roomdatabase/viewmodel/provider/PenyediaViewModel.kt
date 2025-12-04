package com.example.nim_roomdatabase.viewmodel.provider



import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.nim_roomdatabase.repositori.AplikasiSiswa
import com.example.nim_roomdatabase.viewmodel.DetailViewModel
import com.example.nim_roomdatabase.viewmodel.EntryViewModel
import com.example.nim_roomdatabase.viewmodel.HomeViewModel



    val Factory = viewModelFactory{
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            DetailViewModel(this.createSavedStateHandle(), aplikasiSiswa().container.repositoriSiswa)
        }
        initializer{
            EditViewModel(this.createSavedStateHandle(),aplikasiSiswa().container.repositoriSiswa)
        }
    }
}

