package br.senai.sp.jandira.gameproject.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.gameproject.R
import br.senai.sp.jandira.gameproject.dao.GameDAO
import br.senai.sp.jandira.gameproject.model.Game

class AdapterGame(private val context: Context): RecyclerView.Adapter<AdapterGame.GameViewHolder>() {

    private var gamesList= listOf<Game>()

    fun updateGamesList(games: List<Game>){
        this.gamesList = games
        notifyDataSetChanged()
    }

    inner class GameViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val foto = itemView.findViewById<ImageView>(R.id.image_holder)
        val desenvolvedor = itemView.findViewById<TextView>(R.id.textview_nome_desenvolvedor)
        val nome = itemView.findViewById<TextView>(R.id.textview_nome_jogo)
        val descricao = itemView.findViewById<TextView>(R.id.text_descricao_jogo)

        fun bind(game: Game){
            nome.text = game.titulo
            desenvolvedor.text = game.estudio
            descricao.text = game.descricao
            foto.setImageDrawable(game.foto)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.gameholder_layout, parent,false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.bind(gamesList.get(position))
    }

    override fun getItemCount(): Int {
        return gamesList.size;
    }

}


