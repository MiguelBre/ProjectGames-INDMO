package br.senai.sp.jandira.gameproject.dao

import androidx.room.*
import br.senai.sp.jandira.gameproject.model.Console

@Dao
interface ConsoleDAO {

    @Insert
    fun save(console: Console): Long

    @Update
    fun update(console: Console): Int

    @Delete
    fun delete(console: Console): Int

    @Query("SELECT * FROM tbl_console WHERE id = :id")
    fun getUserById(id: Int): Console

}