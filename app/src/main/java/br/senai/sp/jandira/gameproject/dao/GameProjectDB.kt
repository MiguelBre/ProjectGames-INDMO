package br.senai.sp.jandira.gameproject.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.gameproject.model.Console
import br.senai.sp.jandira.gameproject.model.Game
import br.senai.sp.jandira.gameproject.model.User

@Database(entities = [User::class, Game::class, Console::class], version = 1)
abstract class GameProjectDB: RoomDatabase() {

    abstract fun userDAO(): UserDAO

    companion object{
        private lateinit var instance: GameProjectDB
        fun getDataBase(context: Context): GameProjectDB{
            if (!::instance.isInitialized){
                instance = Room.databaseBuilder(context, GameProjectDB::class.java, "db_game_project").allowMainThreadQueries().build();
            }
            return instance;
        }
    }
}