package br.senai.sp.jandira.gameproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import br.senai.sp.jandira.gameproject.R
import br.senai.sp.jandira.gameproject.databinding.ActivityNewAccountBinding
import br.senai.sp.jandira.gameproject.model.NiveisEnum
import br.senai.sp.jandira.gameproject.model.User
import com.google.android.material.slider.Slider

class NewAccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewAccountBinding
    lateinit var editNewEmail: EditText
    lateinit var editNewPass: EditText
    lateinit var editNewName: EditText
    lateinit var editNewCity: EditText
    lateinit var editBirthDay: EditText
    lateinit var sliderGamerLevel: Slider
    lateinit var textGamerLevel: TextView
    lateinit var spinnerConsole: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        editNewEmail = binding.editNewEmail
        editNewPass = binding.editNewPass
        editNewName = binding.editNewName
        editNewCity = binding.editNewCity
        editBirthDay = binding.editBirthDate
        sliderGamerLevel = binding.sliderGamerLevel
        spinnerConsole = binding.spinnerConsole

        sliderGamerLevel.addOnChangeListener { slider, value, fromUser ->
            binding.textGamerLevel.setText(getLevel(value).toString())
        }

//        textGamerLevel.setText(getLevel());

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_new_user, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this, "Teste", Toast.LENGTH_SHORT).show()

        if(item.itemId == R.id.menu_save){
            saveUser()
            return true
        } else if(item.itemId == R.id.menu_settings){
            Toast.makeText(this, "Clicou em configurações", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "Clicou em Sair", Toast.LENGTH_SHORT).show()
            return true
        }
    }

    private fun saveUser() {
        val user = User()
        user.email = editNewName.text.toString();
        user.password = editNewPass.text.toString();
        user.nome = editNewName.text.toString();
        user.cidade = editNewCity.text.toString();
        user.dataNascimento = editBirthDay.text.toString();
        user.nivel = getLevel(sliderGamerLevel.value);
//        user.console = spinnerConsole.toString();
        user.sexo = getSexo();
    }

    private fun getSexo(): Char {

        if (binding.radioButtonMasc.isChecked){
            Toast.makeText(this, "Clicou em masculino", Toast.LENGTH_SHORT).show()
            return 'M'
        } else if (binding.radioButtonFemin.isChecked){
            Toast.makeText(this, "Clicou em feminino", Toast.LENGTH_SHORT).show()
            return 'F'
        } else {
            return 'N'
        }
    }

    private fun getLevel(nivel: Float): NiveisEnum {

        if (nivel in 1.0..10.0){
            return NiveisEnum.INICIANTE
        } else if(nivel in 11.0..20.0){
            return NiveisEnum.BASICO
        } else if(nivel in 21.0..30.0){
            return NiveisEnum.AVANCADO
        } else {
            return NiveisEnum.CASUAL
        }
    }

}