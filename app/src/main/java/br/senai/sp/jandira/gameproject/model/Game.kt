package br.senai.sp.jandira.gameproject.model

import android.graphics.drawable.Drawable
import androidx.room.Entity

@Entity
class Game {

    var id: Int = 0;

    var foto: String? = null;
    var titulo = "";
    var descricao = "";
    var estudio = "";
    var anoLancamento = 0;
    var finalizado = false;

}