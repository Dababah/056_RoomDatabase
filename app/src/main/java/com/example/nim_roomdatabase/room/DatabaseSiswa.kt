package com.example.nim_roomdatabase.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


abstract class DatabaseSiswa : RoomDatabase() {

    abstract fun siswaDao(): SiswaDao

    
