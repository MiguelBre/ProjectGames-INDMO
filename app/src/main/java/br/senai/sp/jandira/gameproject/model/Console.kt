package br.senai.sp.jandira.gameproject.model

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_console")
class Console {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0;

    var nome = "";
    var fabricante = "";
    var descricao = "";
//    var foto: Bitmap? = null;
    var anoLancamento = 0;

}