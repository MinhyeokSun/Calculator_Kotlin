package com.smh.calculator.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.smh.calculator.model.History

@Dao // 룸에 연결된 Dao, Entity를 어떻게 저장하는지, 어떻게 지우는지, 어떻게 조회할지 정의해야함.
interface HistoryDao {

    @Query("SELECT * FROM history") // 모든히스토리 조회
    fun getAll(): List<History> // 히스토리 저장

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()

//    @Delete // 한개지우기
//    fun delete(history: History)
//
//    @Query("SELECT * FROM history WHERE result LIKE :result") // result -> result LIMIT 1  한개만 반환할 때.
//    fun findByResult(result: String): List<History>   // List<History> -> History
}