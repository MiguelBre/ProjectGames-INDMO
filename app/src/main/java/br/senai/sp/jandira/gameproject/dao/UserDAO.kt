package br.senai.sp.jandira.gameproject.dao

import androidx.room.*
import br.senai.sp.jandira.gameproject.model.User

@Dao
interface UserDAO {

    @Insert
        fun save(user: User): Long

    @Update
        fun update(user: User): Int

    @Delete
        fun delete(user: User): Int

    @Query("SELECT * FROM tbl_user WHERE id = :id")
        fun getUserById(id: Int): User

}
