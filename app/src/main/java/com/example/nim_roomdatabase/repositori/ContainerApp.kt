
class AplikasiSiswa : Application(){
    lateinit var container : ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}