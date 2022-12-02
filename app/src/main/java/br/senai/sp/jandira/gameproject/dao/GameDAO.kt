package br.senai.sp.jandira.gameproject.dao

import android.content.Context
import androidx.room.*
import br.senai.sp.jandira.gameproject.model.Game
import br.senai.sp.jandira.gameproject.R


class GameDAO {

    companion object{

        fun getGames(context: Context): List<Game> {

            val pt1 = Game();
            pt1.titulo = "The Legend Of Zelda: Breath Of The Wild";
            pt1.descricao = "A história segue Link, que acorda em uma Hyrule devastada após cem anos de sono e precisa recuperar suas memórias e derrotar o mal causado por Calamity Ganon.";
            pt1.estudio = "Nintendo";
//            pt1.foto = context.getDrawable(R.drawable.zelda_btw);
            val pt2 = Game();
            pt1.titulo = "The Legend Of Zelda: Breath Of The Wild";
            pt1.descricao = "A história segue Link, que acorda em uma Hyrule devastada após cem anos de sono e precisa recuperar suas memórias e derrotar o mal causado por Calamity Ganon.";
            pt1.estudio = "Nintendo";
            val pt3 = Game();
            pt1.titulo = "The Legend Of Zelda: Breath Of The Wild";
            pt1.descricao = "A história segue Link, que acorda em uma Hyrule devastada após cem anos de sono e precisa recuperar suas memórias e derrotar o mal causado por Calamity Ganon.";
            pt1.estudio = "Nintendo";
            val pt4 = Game();
            pt1.titulo = "The Legend Of Zelda: Breath Of The Wild";
            pt1.descricao = "A história segue Link, que acorda em uma Hyrule devastada após cem anos de sono e precisa recuperar suas memórias e derrotar o mal causado por Calamity Ganon.";
            pt1.estudio = "Nintendo";
            val pt5 = Game();
            pt1.titulo = "The Legend Of Zelda: Breath Of The Wild";
            pt1.descricao = "A história segue Link, que acorda em uma Hyrule devastada após cem anos de sono e precisa recuperar suas memórias e derrotar o mal causado por Calamity Ganon.";
            pt1.estudio = "Nintendo";

            val games = listOf<Game>(pt1, pt2, pt3, pt4, pt5)

            return games;
        }
    }
}