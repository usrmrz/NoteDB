package dev.usrmrz.roomdb

import android.app.Application
import dev.usrmrz.roomdb.data.MainDb

class App : Application() {
    val database by lazy { MainDb.createDataBase(this) }
}