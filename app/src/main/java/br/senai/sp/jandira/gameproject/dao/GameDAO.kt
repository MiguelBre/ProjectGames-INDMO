package br.senai.sp.jandira.gameproject.dao

import androidx.room.*
import br.senai.sp.jandira.gameproject.model.Game

@Dao
interface GameDAO {

    @Insert
    fun save(game: Game): Long

    @Update
    fun update(game: Game): Int

    @Delete
    fun delete(game: Game): Int

    @Query("SELECT * FROM tbl_game WHERE id = :id")
    fun getGameById(id: Int): Game

}