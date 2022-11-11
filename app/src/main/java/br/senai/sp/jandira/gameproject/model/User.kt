package br.senai.sp.jandira.gameproject.model

import android.graphics.drawable.Drawable
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tbl_user")
class User {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0;

    var foto: Drawable? = null;
    var email: String = "";
    var password: String = "";
    var nome: String = "";
    var cidade: String = "";
    var dataNascimento: LocalDate? = null;
    var sexo: Char = 'I';
    var nivel = NiveisEnum.INICIANTE;
    var console: Console? = null;

}