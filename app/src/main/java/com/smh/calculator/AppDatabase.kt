package com.smh.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.smh.calculator.dao.HistoryDao
import com.smh.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase  : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}