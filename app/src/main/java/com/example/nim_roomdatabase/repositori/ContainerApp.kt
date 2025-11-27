package com.example.nim_roomdatabase.repositori

import android.app.Application
import com.example.nim_roomdatabase.room.DatabaseSiswa


class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya
     * untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}