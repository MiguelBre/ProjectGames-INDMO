package br.senai.sp.jandira.gameproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.senai.sp.jandira.gameproject.R
import br.senai.sp.jandira.gameproject.databinding.ActivityHome1Binding

class HomeActivity1 : AppCompatActivity() {

    private lateinit var binding: ActivityHome1Binding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = binding.recyclerviewGames;
        recyclerView.layoutManager = LinearLayoutManager(this)      //Mantém a recycler view na vertical
        recyclerView.setHasFixedSize(true)      //Aumenta a performance da recycler view





        setContentView(binding.root)
    }
}