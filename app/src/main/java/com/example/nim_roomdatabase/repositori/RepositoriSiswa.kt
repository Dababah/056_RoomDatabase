package com.example.nim_roomdatabase.repositori

import com.example.nim_roomdatabase.room.Siswa
import com.example.nim_roomdatabase.room.SiswaDao

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
): RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao
        .getAllSiswa()
    override suspend fun insertSiswa(siswa: Siswa) = siswaDao
        .insert(siswa)
}