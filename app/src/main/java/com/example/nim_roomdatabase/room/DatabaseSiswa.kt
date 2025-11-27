

    companion object {
        @Volatile
        private var Instance: DatabaseSiswa? = null

        fun getDatabase(context: Context): DatabaseSiswa {
            return (Instance?: synchronized(this){
                Room.databaseBuilder(
                    context, DatabaseSiswa::class.java,
                    "siswa_database")
                    .build().also { Instance = it }
            })
        }
    }
}