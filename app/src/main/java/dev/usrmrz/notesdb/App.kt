package dev.usrmrz.notesdb

import android.app.Application
import dev.usrmrz.notesdb.data.MainDb

class App :Application() {
    val database by lazy { MainDb.createDataBase(this) }
}