package br.senai.sp.jandira.gameproject.model

import android.graphics.drawable.Drawable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity(tableName = "tbl_game")
class Game {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0;

    var foto: Drawable? = null;
    var titulo = "";
    var descricao = "";
    var estudio = "";
    var anoLancamento = 0;
    var finalizado = false;

}