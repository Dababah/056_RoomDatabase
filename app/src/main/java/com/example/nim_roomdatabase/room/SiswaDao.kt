
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
}